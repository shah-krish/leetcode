import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/
public class containsDuplicate {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
