import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,0};
        quicksort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] nums){
        quick(nums,0,nums.length-1);
    }
    public static void quick(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = place(arr,low,high);
            quick(arr,low,pivotIndex-1);
            quick(arr,pivotIndex+1,high);
        }
    }

    private static int place(int[] arr, int low, int high) {
        int pivot = arr[low]; //first element
        int i = low+1, j=high;
        while(i<j){
            while(arr[i]<=pivot&&i<=high){ //first element greater than pivot
                i++;
            }
            while(arr[j]>pivot && j>=low){ //first element smaller than pivot from right
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j); //swap pivot back in place
        return j;
    }

    private static void swap(int[] arr,int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }


}
