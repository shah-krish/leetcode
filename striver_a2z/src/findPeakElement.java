public class findPeakElement {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid+1]>nums[mid]){
                low = mid + 1;
            }
            else if(nums[mid-1]>nums[mid]){
                high = mid -1;
            }
            else{
                return mid;
            }
        }
        return low;
    }
}
