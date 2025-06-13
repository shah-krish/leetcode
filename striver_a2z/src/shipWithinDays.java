public class shipWithinDays {
    public static void main(String[] args) {

    }
    public int shipWithinDays(int[] weights, int days){
        int ans = 0;
        if(days>weights.length){
            return -1;
        }
        int high = 0, low = Integer.MIN_VALUE;
        for(int i= 0; i< weights.length; i++){
            high+=weights[i];
            low = Math.max(low, weights[i]);
        }
        while(low<high){
            int mid = (low+high)/2;
            int temp = 0;
            int counter = 1;
            for(int i = 0; i<weights.length; i++){
                if(temp+weights[i]>mid){
                    counter++;
                    temp = weights[i];
                }
                else{
                    temp+=weights[i];
                }
            }
            if(counter<=days){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
