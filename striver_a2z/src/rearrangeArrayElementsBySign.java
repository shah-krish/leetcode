public class rearrangeArrayElementsBySign {
    public static void main(String[] args) {

    }
    public static int[] rearrangeArray(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int[] answer = new int[nums.length];
        int positive = 0, negative = 1;
        for(int i:nums){
            if(i>=0){
                answer[positive] = i;
                positive+=2;
            }
            else{
                answer[negative] = i;
                negative+=2;
            }
        }
        return answer;
    }
}
