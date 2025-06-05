public class findMinRotated {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        int offset = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[high]){
                low = mid +1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}
