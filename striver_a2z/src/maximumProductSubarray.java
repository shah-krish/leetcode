public class maximumProductSubarray {
    public static void main(String[] args) {

    }
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for(int i = 0 ; i<nums.length; i++){
            if(prefix == 0 ){ //multiplication by 0, we don't need to carry it forward as it'll turn others 0
                prefix = 1;
            }
            if(suffix == 0 ){
                suffix = 1;
            }

            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            max = Math.max(max, Math.max(suffix,prefix));
        }
        return max;
    }
}
