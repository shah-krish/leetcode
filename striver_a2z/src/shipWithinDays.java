public class shipWithinDays {
    public static void main(String[] args) {

    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = Integer.MAX_VALUE-1;
        while(low<=high){
            int mid = (low+high)/2;
            int min = sum(weights,mid);
            if(min>days){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    static int sum(int[] weights, int mid){
        int currentWeight = 0;
        int daysRequired = 1;

        for (int weight : weights) {
            if (currentWeight + weight > mid) {
                daysRequired++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }
        return daysRequired;
    }
}
