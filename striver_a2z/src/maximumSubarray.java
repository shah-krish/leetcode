public class maximumSubarray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int sum = Integer.MIN_VALUE;
        for(int i =0; i<nums.length;i++){
            curr += nums[i];
            if(curr<0){
                curr =0;
            }
            sum = Math.max(sum,curr);
        }
        return sum;
    }
}
/* Solved on may 7 '25
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i = 0; i<nums.length; i++){
            if(sum<0){
             sum = 0;
            }
            sum+=nums[i];
            ans = Math.max(sum,ans);

        }
        return ans;
    }
}
 */
