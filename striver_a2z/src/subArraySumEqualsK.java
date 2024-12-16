public class subArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2,1,2,1};
        System.out.println(subarraySum(arr, 3));
    }
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int counter = 0;
        for (int i =0; i<nums.length; i++){
            sum += nums[i];
            if(sum == k && (i+1 < nums.length) && (nums[i+1]!=0)){
                counter ++;
                sum = 0;
            }
            else if(sum == k && (i+1 < nums.length) && (nums[i+1]==0)){
                counter ++;
            }
            System.out.println("sum = "+sum);
            System.out.println("counter = "+counter);
        }
        return counter;
    }
}
    /* BRUTE FORCE APPROACH SHITTY TIME COMPLEXITY
    public static int subarraySum(int[] nums, int k) {
        int counter = 0;
        int sum;
        for(int i =0; i<nums.length; i++){
            sum =0;
            for(int j = i; j<nums.length;j++){
                //System.out.println("i ="+i + "j="+j);
                sum+=nums[j];
                if(sum == k){
                    counter ++;
                }



              //  System.out.println(sum);
              //  System.out.println("counter = " + counter);
            }
        }
        return counter;
    }
}

     */
