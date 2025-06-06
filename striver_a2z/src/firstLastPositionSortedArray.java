public class firstLastPositionSortedArray {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 0){
            return ans;
        }
        int low = 0;
        int high = nums.length-1;
        int tempIndex = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                tempIndex=mid;
                high = mid -1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        int left = 0;
        int right = nums.length-1;
        int tempIndex2 = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                tempIndex2 = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        ans[0] = tempIndex;
        ans[1] = tempIndex2;
        return ans;
    }
}
