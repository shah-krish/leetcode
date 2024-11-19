import java.util.*;
public class majorityElement2 {
    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        double limit  = Math.floor(nums.length/3);
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        System.out.println(map);
        for(int i : nums){
            if(map.get(i)>limit && !list.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
