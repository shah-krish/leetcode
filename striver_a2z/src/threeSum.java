
import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 1, 2};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        //HashSet<List<Integer>> set = new HashSet<>();
        if(nums.length<3){
            return ans;
        }
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int total = 0 - nums[i];
            int low = i + 1;
            int high = nums.length -1;
            while(low<high){
                if(nums[low] + nums[high] == total){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    ans.add(list);

                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;

                    low++;
                    high--;
                }
                else if(nums[low] + nums[high] < total){
                    low ++;
                }
                else{
                    high --;
                }
            }
        }
        //ans.addAll(set);
        return ans;
    }
}