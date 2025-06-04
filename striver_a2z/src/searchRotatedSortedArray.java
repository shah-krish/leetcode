public class searchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {};


    }

    public int search(int[] nums, int target) {
        int offset = -1;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                offset = i;
            }
        }
        int low=0;
        int high=0;
        if(offset==-1){
            high = nums.length-1;
        }
        else if(target <= nums[nums.length-1]){
            low=offset+1;
            high=nums.length-1;
        }
        else{
            low=0;
            high=offset;
        }
        //System.out.println(low);
        while (low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

}
