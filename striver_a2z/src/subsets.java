import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int index = 0;
        List<Integer> l1 = new ArrayList<>();
        helper(nums, index, l1, ans);
        return ans;
    }

    private static void helper(int[] nums, int index, List<Integer> l1, List<List<Integer>> ans) {
        if(index>=nums.length){
            ans.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[index]);
        helper(nums, index+1, l1, ans);
        Object obj = nums[index];
        l1.remove(l1.size() - 1);
        helper(nums, index+1, l1, ans);
    }
}
