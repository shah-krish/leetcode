import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 1, 2};
        System.out.println(threeSum(nums));
    }
    //instead of using if ans.contains which has o(n) so it becomes n^3, we use loops to check for duplicates
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate elements for 'i' to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    // Skip duplicates for 'j'
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    // Skip duplicates for 'k'
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}