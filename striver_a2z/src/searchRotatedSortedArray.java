public class searchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(search(arr, 0));
    }

    public static int search(int[] nums, int target) {
        int rotationIndex = value(nums); // Get the index of the smallest element

        // Perform binary search in the correct half
        if (nums[rotationIndex] == target) {
            return rotationIndex;
        }

        if (rotationIndex == 0) {
            return binarySearch(nums, 0, nums.length - 1, target); // Search entire array
        }

        if (target >= nums[0]) {
            return binarySearch(nums, 0, rotationIndex - 1, target); // Search left half
        } else {
            return binarySearch(nums, rotationIndex, nums.length - 1, target); // Search right half
        }
    }

    // Standard Binary Search
    private static int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static int value(int[] nums) {
        int low = 0, high = nums.length - 1;

        // If the array is already sorted (no rotation), return index 0
        if (nums[low] <= nums[high]) {
            return 0;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than the next element, rotation point is mid + 1
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }

            // If mid element is smaller than the previous element, rotation point is mid
            if (mid > low && nums[mid] < nums[mid - 1]) {
                return mid;
            }

            // Decide which half to search
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
