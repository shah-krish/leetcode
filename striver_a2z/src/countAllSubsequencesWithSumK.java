import java.util.ArrayList;
import java.util.List;

public class countAllSubsequencesWithSumK {
    public static void main(String[] args) {

    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        int counter = 0;
        List<Integer> ls = new ArrayList();
        int index = 0;
        int[] tracker = new int[1]; //used this to track because if we use int tracker instead, then it will create its own copy in the helper function and not update this one
        helper(nums, k, counter, ls, index, tracker);
        return tracker[0];
    }
    public void helper(int[] nums, int k, int counter, List<Integer> ls, int index, int[] tracker){
        if(index >= nums.length){
            if(counter==k){
                tracker[0]++;
                return;
            }
        }
        ls.add(nums[index]);
        counter+=nums[index];
        helper(nums, k, counter, ls, index+1, tracker);
        counter-=nums[index];
        ls.remove(ls.size()-1);
        helper(nums, k , counter, ls, index+1, tracker);
    }
}
