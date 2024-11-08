import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        double minFreq = Math.floor(nums.length/2);
        for(int i =0; i<nums.length;i++){
            if(map.get(nums[i])>minFreq){
                return nums[i];
            }
        }
        return 0;
    }
}
