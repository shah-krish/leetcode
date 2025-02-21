public class kokoBananas {
    public static void main(String[] args) {

    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = maxValue(piles);
        while(low<=high){
            int mid = (low+high)/2;
            if(eat(piles,mid,h)){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    static int maxValue(int[] piles){
        int max = 0;
        for(int i : piles){
            max = Math.max(max,i);
        }
        return max;
    }
    static boolean eat(int[] piles, int mid, int h){
        long counter = 0;
        for(int i : piles){
            counter += Math.ceilDiv(i,mid);
        }
        if(counter<=h){
            return true;
        }
        return false;
    }
}
