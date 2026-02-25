//https://leetcode.com/problems/3sum/
import java.util.*;

public class threeSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int x = i+1, y = nums.length-1;
            while(x<y){
                if(nums[i] + nums[x] + nums[y] == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[x]);
                    list.add(nums[y]);
                    ans.add(list);

                    while(x<y && nums[y] == nums[y-1]){
                        y++;
                    }
                    while(x<y && nums[x+1]==nums[x]){
                        x++;
                    }
                    x++;
                    y--;
                }
                else if(nums[i] + nums[x] + nums[y] > 0){
                    y--;
                }
                else{
                    x++;
                }
            }
        }
        return ans;
    }
}
/* EXCEEDED TIME LIMIT

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            int target = 0 - nums[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = i+1; j<nums.length; j++){
                if(map.containsKey(target - nums[j])){
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(target-nums[j]);
                    Collections.sort(l1);
                    if(!ans.contains(l1)){
                        ans.add(l1);
                    }
                }
                else{
                    map.put(nums[j], j);
                }
            }
        }
        return ans;
    }

 */