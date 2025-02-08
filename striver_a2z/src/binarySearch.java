public class binarySearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int middle = (high + low) / 2;
            if (nums[middle] < target) {
                low = middle + 1;
            } else if (nums[middle] > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
/*
    int start = 0;
        int end = nums.length-1;
        for(int i=0; i <nums.length;i++){
            if(nums[start]==target){
                return start;
            }
            else if(nums[end] == target){
                return end;
            }
            else if(nums[end]>target){
                end --;
            }
            else{
                start++;
            }
        }
        return -1;
 */
