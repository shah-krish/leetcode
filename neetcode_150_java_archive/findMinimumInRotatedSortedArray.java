public class findMinimumInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }
        int low = 0, high = nums.length-1;
        while(low<high){
            if(high==low+1){
                return nums[low+1];
            }
            int mid = (low+high)/2;
            if(nums[low]>nums[mid]){
                high = mid;
            }
            else{
                low = mid;
            }
        }
        return nums[low];
    }
    /*
    public int findMin(int[] nums) {
        if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1]<nums[i]){
                return nums[i+1];
            }
        }
        return -1;
    }

     */
}
