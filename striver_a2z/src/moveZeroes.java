public class moveZeroes{
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        int numberPointer = 0;
        while(zeroPointer< nums.length && numberPointer<nums.length){
            if(nums[zeroPointer]!=0){
                zeroPointer++;
            }
            else if(nums[numberPointer]==0){
                numberPointer++;
            }
            else if(zeroPointer<numberPointer){
                swap(nums, zeroPointer, numberPointer);
                zeroPointer++;
                numberPointer++;
            }
            else{
                numberPointer++;
            }
        }
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}