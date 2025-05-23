public class productOfArrayExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            pre[i] = prefix;
            prefix *= nums[i];
        }
        for(int j = nums.length-1; j>=0; j--){
            suf[j] = suffix;
            suffix *= nums[j];
        }
        for(int k = 0; k<nums.length; k++){
            nums[k] = pre[k] * suf[k];
        }
        return nums;
    }
}
