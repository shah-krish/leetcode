import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int k =nums[0];
        int index = 1;
        for(int i =1; i<nums.length;i++){
            if(nums[i] == k){
                continue;
            }
            else{
                nums[index] = nums[i];
                k = nums[index];
                index++;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return index;
    }
}