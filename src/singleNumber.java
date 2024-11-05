import java.util.Arrays;
import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        /*
        The XOR operation has two useful properties:

        ( x ^ x = 0 ): XORing a number with itself results in 0.
        ( x ^ 0 = x ): XORing a number with 0 keeps the number unchanged.
        By XORing all elements in the array, the elements that appear twice will cancel each other out (since ( x ^+ x = 0 )),
        leaving only the single element that appears once.
         */
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }
    //1^2 = 3
    //3^2 = 1 (2 cancels prev 2)
    //return 1
}
    /*
    public int singleNumber(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i = 0, j =1;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                return nums[i];
            }
            i+=2;
            j+=2;
        }
        return nums[nums.length];
    }
}

        public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(int i : nums){
            if(map.get(i)==1){
                return i;
            }
        }
        return -1;
    }

     */
