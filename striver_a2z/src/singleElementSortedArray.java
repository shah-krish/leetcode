public class singleElementSortedArray {
    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length<=2){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int low = 1;
        int high = nums.length-2;
        while(low<=high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
/*
The index sequence of the duplicate numbers in the left half is always (even, odd). That means one of the following conditions will be satisfied if we are in the left half:
If the current index is even, the element at the next odd index will be the same as the current element.
Similarly, If the current index is odd, the element at the preceding even index will be the same as the current element.

The index sequence of the duplicate numbers in the right half is always (odd, even). That means one of the following conditions will be satisfied if we are in the right half:
If the current index is even, the element at the preceding odd index will be the same as the current element.
Similarly, If the current index is odd, the element at the next even index will be the same as the current element.
 */
