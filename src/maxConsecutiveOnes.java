public class maxConsecutiveOnes {
    public static void main(String[] args) {

    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter =0;
        int max = Integer.MIN_VALUE;
        int i =0;
        while(i<nums.length){
            if(nums[i]==1){
                counter++;
            }
            else{
                max = Math.max(counter, max);
                counter = 0;
            }
        }
        return max;
    }
}
