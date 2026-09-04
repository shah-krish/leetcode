import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {

    }
    //commented code where i used array to traverse. direct set traversal saves space and time
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        /*
        int[] arr = new int[set.size()];
        int i = 0;
        for(Integer s:set){
            arr[i] = s;
            i++;
        }
        */
        int max = 0;
        for(Integer s : set){
            if(set.contains(s-1)){
                continue;
            }
            else{
                int counter =0;
                while((set.contains(s))){
                    counter++;
                    s++;
                }
                max = Math.max(max, counter);
            }
        }
        return max;
        /*
        int counter = 1;
        int max = 0;
        for(int j =0; j<arr.length; j++){
            if(set.contains(arr[j]-1)){
                continue;
            }
            else{
                int k = j;
                int target = arr[k]+1;
                while(k<arr.length && set.contains(target)){
                    counter++;
                    target++;
                }
                max = Math.max(counter,max);
                counter =1;
            }
        }
        return max;

         */
    }
}
/* INITIAL INTUITIVE SOLUTION, BUT LC MENTIONED THAT REQUIRED TC IS O(N)
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int counter = 0;
        int max = 0;
        for(int i =0;i <nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                counter++;
                max = Math.max(max, counter);
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else{
                max = Math.max(max, counter);
                counter = 0;
            }
        }
        return max+1;
    }
 */