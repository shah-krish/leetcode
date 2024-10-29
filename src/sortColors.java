import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] arr={2,0,1};
        sortColors(arr);
    }
    //0 to low-1 -> 0; low to mid-1 ->1 ; mid to high -> random; high to n-1 -> 2
    public static void sortColors(int[] nums) {
        if(nums.length<=1){
            return;
        }
        int low = 0, mid = 0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
                mid++;
            }
        }
    }
    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
