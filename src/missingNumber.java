public class missingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int addition = 0;
        for(int i : nums){
            addition += i;
        }
        return sum - addition;
    }
}
