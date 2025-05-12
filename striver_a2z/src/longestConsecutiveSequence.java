import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        longestConsecutive(nums);
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int counter;
        int max=0;
        for(int i : set){
            if(set.contains(i-1)){
                continue;
            }
            else{
                counter = 1;
                while(set.contains(i+counter)){
                    counter++;
                }
                max = Math.max(max, counter);
            }
        }
        return max;
    }


    /* o(log n) but we need o(n)
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int counter = 1;
        int max = 1;
        Arrays.sort(nums);
        for(int i= 0; i<nums.length-1; i++){
            if(nums[i+1]==nums[i]){
                continue;
            }
            if(nums[i+1]-nums[i]==1){
                counter++;
                max = Math.max(counter,max);
            }
            else{
                counter=1;
            }
        }
        return max;
    }
     */
}
