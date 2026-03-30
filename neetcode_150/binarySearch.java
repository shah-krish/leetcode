//https://leetcode.com/problems/binary-search/
public class binarySearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<=right){
            int middle = (left+right)/2;
            if(nums[middle] == target){
                return middle;
            }
            else if(nums[middle] > target){
                right = middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return -1;
    }
}
