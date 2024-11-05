public class rotateArray {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start, int end){
        int high = end;
        int low = start;
        while(low<high){
            swap(nums,low,high);
            low++;
            high--;
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
    /*
    public void rotate(int[] nums, int k) {
        if(nums.length<=1){
            return;
        }
        int[] ans = new int[nums.length];
        for(int i =0; i<nums.length;i++){
            ans[(i+k)%nums.length] = nums[i];
        }
        for(int i =0; i<nums.length;i++){
            nums[i] = ans[i];
        }
    }
}

     */
