import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls,k));

    }
    //solved myself again on 15th June
    public static int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int high = nums[nums.length-1]-nums[0];
        int low = 1;
        if(k==2){
            return high;
        }
        while(low<=high){
            int mid = (low+high)/2;
            int counter = 1;
            int placed = 0;
            for(int i = 1; i <nums.length; i++){
                if(nums[i]-nums[placed]>=mid){
                    counter++;
                    placed = i;
                }
            }
            if(counter<k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return high;
    }
}
    /*
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length-1];

        while(low<=high){
            int mid = (low+high)/2;
            if(placed(stalls,mid,k)){

                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
    static boolean placed(int[] stalls, int mid, int cows){
        int counter = 1;
        int last = stalls[0];
        for(int i = 1; i<stalls.length;i++){
            if(stalls[i]-last>=mid){
                counter++;
                last = stalls[i];
            }
        }
        //System.out.println(counter);
        return counter>=cows;
    }
}


     */