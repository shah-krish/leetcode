public class splitArrayLargestSum {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int i : nums) {
            high += i;
            low = Math.min(low, i);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(nums, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;

    }
    public static int countPartitions(int[] a, int maxSum) {
        int n = a.length;
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < n; i++) {
            if (subarraySum + a[i] <= maxSum) {
                subarraySum += a[i];
            } else {
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;
    }
}
