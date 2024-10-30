public class countInversions {
    public static void main(String[] args) {

    }
    //         https://www.naukri.com/code360/problems/count-inversions_615

    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return rip(arr);
    }
    public static long rip(long[] nums){
        long count =0;
        if(nums.length<2){
            return count;
        }
        int mid  = nums.length/2;
        long[] left = new long[mid];
        for(int i =0;i<mid;i++){
            left[i] = nums[i];
        }
        long[] right = new long[nums.length-mid];
        for(int i=0, p=mid;i<right.length;i++,p++){
            right[i]=nums[p];
        }
        count += rip(left);
        count += rip(right);
        return merge(nums,left,right, count);
    }
    public static long merge(long[] arr,long[] left, long[] right, long count){
        int i=0, k=0,j=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k]= left[i];
                k++;
                i++;
            }
            else{
                arr[k] = right[j];
                k++;
                j++;
                count += left.length-i;
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return count;
    }
}
