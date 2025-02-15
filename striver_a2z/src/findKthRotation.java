import java.util.*;
public class findKthRotation {
    public static void main(String[] args) {

    }
    public int findKRotation(List<Integer> arr) {
        int low = 0;
        int high = arr.size()-1;
        if (arr.get(low) <= arr.get(high)) {
            return 0;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                return mid+1;
            }
            if(mid>low && arr.get(mid)<arr.get(mid-1)){
                return mid-1 ;
            }
            if(arr.get(mid)>arr.get(high)){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
