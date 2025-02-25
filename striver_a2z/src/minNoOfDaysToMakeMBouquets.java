import java.util.Arrays;

public class minNoOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,13,11,12,7};
        System.out.println(minDays(arr,2,3));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = 1;
        int high = (int) 1e9;
        while(low<high){
            int mid = low + (high - low) / 2;
            if(check(bloomDay,m,k,mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    static boolean check (int[] bloomDay,int m, int k, int current){
        int counter = 0;
        int possible = 0;
        for(int i : bloomDay ){
            if(i<=current){
                counter++;
                if (counter == k) {
                    possible++;
                    counter = 0;
                }
            }
            else {
                counter = 0;
            }
        }
        return possible >=m;
    }
}
