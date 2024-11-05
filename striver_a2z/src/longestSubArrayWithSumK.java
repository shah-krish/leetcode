import java.util.*;
public class longestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 3, 5, 5};
        System.out.println(lenOfLongestSubarr(arr, 16));
    }
    /*
     HashMap that stores the cumulative sums (the sums of elements from the start of the array up to the current index) and their corresponding indices.
     For each element, it updates the cumulative sum by adding the current element arr[i].
     If sum==k, this means that the subarray from the start of the array to the current index i has a sum equal to k, and it updates maxLength to i + 1
     If sum-k exists, it means there was a previous cumulative sum such that the subarray between that previous index and the current index i has a sum equal to k
     Update maxLength with the maximum of its current value or the length of this subarray (i - map.get(sum - k)
     */
    public static int lenOfLongestSubarr(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLength = i + 1;
            }
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
    /*
    public static int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        int first = 0;
        int last = 0;
        int len = 0;
        int ans = 0;
        while(last<arr.length){
            //System.out.println(ans);
            if(ans==k){
                len = Math.max(len, last - first);
                first=last;
                ans = 0;
            }
            else if (ans > k){
                first = last;
                ans = 0;
            }
            else {
                ans += arr[last];
                last ++;
            }
            //System.out.println("len "+len);
        }
        return len;
    }
}

     */
