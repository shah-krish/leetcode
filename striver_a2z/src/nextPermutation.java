import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {

    }
    public static void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int a=-1;
        for(int i = nums.length-2;i>=0;i--) {
            if (nums[i] < nums[i + 1]) {
                a = i;
                break;
            }
        }
        if (a < 0) {
            reverse(nums);
        }
        else{
            int b=0;
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[a]){
                    b=i;
                    break;
                }
            }
            swap(nums,a,b);
            Arrays.sort(nums,a+1,nums.length);
        }
        //System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}
