import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls,k));

    }
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
