import java.util.*;
public class leadersinAnArray {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> leaders(int nums[]) {
        // code here
        ArrayList<Integer> list = new ArrayList();
        int check = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i-- ){
            if(nums[i]>=check){
                list.add(0, nums[i]);
                check = nums[i];
            }
        }
        return list;
    }
}
