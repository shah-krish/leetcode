// https://leetcode.com/problems/product-of-array-except-self/

public class productExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i<nums.length; i++){
            ans[i] = nums[i-1]*ans[i-1];
        }
        //System.out.println(Arrays.toString(ans));
        int counter = 1;
        for(int i = nums.length-2; i>=0; i--){
            counter = counter * nums[i+1];
            //System.out.println(nums[i+1] +"*"+ counter);
            ans[i] = ans[i] * counter;
        }
        return ans;
    }
}

