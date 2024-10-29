public class setMismatch {
    public static void main(String[] args) {

    }
    public static int[] findErrorNums(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            if(arr[nums[i]-1]){
                ans[0] = nums[i];
            }
            else {
                arr[nums[i]-1] = true;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(!arr[i]){
                ans[1] = i+1;
            }
        }
        return ans;
    }
}
