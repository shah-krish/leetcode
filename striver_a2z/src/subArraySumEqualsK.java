import java.util.HashMap;

public class subArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2,1,2,1};
        System.out.println(subarraySum(arr, 3));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int counter = 0;
        int accumulator = 0;
        map.put(0, 1);
        for(int i =0; i<nums.length; i++){
            accumulator += nums[i];
            if(map.containsKey(accumulator-k)){
                counter+=map.get(accumulator-k);
            }
            if(map.containsKey(accumulator)){
                map.put(accumulator, map.get(accumulator)+1);
            }
            else{
                map.put(accumulator, 1);
            }
        }
        //System.out.println(map);
        return counter;
    }
    }

