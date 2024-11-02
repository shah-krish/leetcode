public class checkIfSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 3};
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        return count <= 1;
    }
}

    /*
    public static boolean check(int[] nums) {
        int index = 0;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<nums.length;i++){
            if(nums[i]<=smallest){
                smallest = nums[i];
                index = i;
            }
        }
        //[5,1,1,2,3]
        //[6,8,6]
        //System.out.println(index);
        int last = Integer.MIN_VALUE;
        for(int i = index; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
            last = nums[i+1];
        }
       // System.out.println(last);
        if(nums[0]<last && index!=0){
            return false;
        }
        for(int i=0;i<index-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}

     */
