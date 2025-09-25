public class maximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, -5, -2, -4, 3};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int curr = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] < 0 && min!=0){
                min = min*nums[i];
                max = Math.max(min,max);
            }
            else if(nums[i] < 0 && min == 0){
                min = nums[i];
                max = Math.max(min,max);
            }
            else if(nums[i] > 0 ){
                max *= nums[i];
            }
        }
        return max;
    }

}
/*
        for(int i = 1; i<nums.length; i++){
            counter *= nums[i];
            max = Math.max(counter, max);

            if(counter == 0 && nums[i] > 0){
                counter = nums[i];
            }
            System.out.println(counter);
        }
        return max;
 */