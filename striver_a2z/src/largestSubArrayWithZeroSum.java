import java.util.HashMap;

public class largestSubArrayWithZeroSum {
    public static void main(String[] args) {

    }

    int maxLen(int arr[]) {
        // code here
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0 ; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            }
            map.put(arr[i],i);
        }
        return max;
    }
}
