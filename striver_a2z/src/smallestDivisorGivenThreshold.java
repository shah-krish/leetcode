public class smallestDivisorGivenThreshold {
    public static void main(String[] args) {

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MAX_VALUE-1;

        while(low<=high){
            int counter = 0;
            int mid = (low+high)/2;
            for(int i = 0; i<nums.length;i++){
                counter+=Math.ceilDiv(nums[i],mid);
            }
            if(counter>threshold){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}
