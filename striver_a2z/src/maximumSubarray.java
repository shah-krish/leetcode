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
