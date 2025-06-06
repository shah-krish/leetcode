import java.util.HashMap;
import java.util.HashSet;

public class twoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = nums[i];
                ans[1] = map.get(target-nums[i]);return ans;
            }
            else{
                map.put(nums[i], i);
            }
        }return ans;
    }
}
