import java.util.Arrays;

public class searchRotated2 {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) { // handle the edge case arr[low] = arr[mid] = arr[high] eg [3,1,2,3,3,3,3]
                low = low + 1;
                high = high - 1;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] <= target && target<= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return false;
    }
}
/*
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid -1;
            }
            else if(nums[mid]==target){
                return true;
            }
        }
        return false;
    }
 */
