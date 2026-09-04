//https://leetcode.com/problems/koko-eating-bananas/
public class kokoEatingBananas {
    public static void main(String[] args) {

    }
    public static int  minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MAX_VALUE-2;
        while(low<=high){
            double counter = 0;
            int mid = (low+high)/2;
            for(int i : piles){
                counter += Math.ceilDiv(i,mid);
            }
            if(counter<=h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
