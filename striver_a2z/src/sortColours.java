import java.util.ArrayList;
import java.util.Arrays;

public class sortColours {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0};

    }
        public void sortColors(int[] nums) {
            int low = 0, mid = 0;
            int high = nums.length-1;
            while(low<=high){
                if(nums[high]==2){
                    high--;
                }
                else if(nums[low]==2){
                    swap(nums, low, high);
                    high--;
                }
                else if(nums[low]==0){
                    swap(nums,low,mid);
                    mid++;
                    low++;
                }
                else{
                    low++;
                }
            }
        }
        public void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}

//    static void segregate0and1(int[] arr) {
//        // code here
//        for (int low = 0; low < arr.length; low++) {
//            if (arr[low] == 1) {
//                int high = arr.length - 1;
//                while (high > low) {
//                    if (arr[high] == 0) {
//                        swap(arr, low, high);
//                        break;
//                    } else {
//                        high--;
//                    }
//                }
//            }
//        }
//    }
//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

