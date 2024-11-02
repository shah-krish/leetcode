public class moveZeroes {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int a =0, b=0;
        while(a<nums.length){
            if(nums[a]==0){
                a++;
            }
            else{
                swap(nums,a,b);
                a++;
                b++;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}