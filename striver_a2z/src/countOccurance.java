//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence

public class countOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(highCount(arr,2));
    }
    static int countFreq(int[] arr, int target) {
        // code here
        int a = lowCount(arr,target);
        int b  = highCount(arr,target);
        if (a == -1) return 0;  // Target not found
        return b - a + 1;
    }
    static int lowCount(int[] arr, int target){
        int low = 0;
        int high  = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid -1;
            }
            else if(arr[mid]>target){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    static int highCount(int[] arr, int target){
        int low = 0;
        int high  = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}

