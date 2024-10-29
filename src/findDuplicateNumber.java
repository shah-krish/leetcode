import java.util.*;

public class findDuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]]; //moves twice as fast as slow
            if(slow == fast){ //the point where they intersect
                break;
            }
        }//the intersecting point and start are at the same distance from cycle head (aka repeating element)
        int slow2=0;
        while(true){
            slow2 = nums[slow2];
            slow = nums[slow];
            if(slow == slow2){ //found cycle head
                break;
            }
        }
        return slow;
    }
}

    /*
    public int findDuplicate(int[] nums) {
      for(int i=0;i<nums.length;i++){
          int index = Math.abs(nums[i]);
          if(nums[index]<0){
              return nums[i];
          }
      }
      return 0;
    }
}

    /*
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
     */

    /*
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i =0; i<nums.length;i++){
            if(map.get(nums[i])==2){
                return nums[i];
            }

        }
        return 0;
    }
}

     */
