public class maximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

}
/* INITIAL FLAWED LOGIC CUZ WHAT IF AFTER NEGATIVE NEXT POSITIVE IS BIGGER?
4,-1,2 SHOULD BE 5 AND NOT 4

  if(nums.length<=1){
            return nums[0];
        }
        int sum = nums[0];
        int holder = Integer.MIN_VALUE;
        boolean hasPositive = false;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0){
                hasPositive = true;
                break;
            }
        }
        if(hasPositive){
            for(int i=0; i<nums.length;i++){
                if(nums[i]>=0){
                    sum+= nums[i];
                }
                else if(nums[i]<0){

                    sum = 0;
                }
                holder = Math.max(holder,sum);
            }
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                holder = Math.max(holder,nums[i]);
            }
        }
        return holder;
    }
 */
