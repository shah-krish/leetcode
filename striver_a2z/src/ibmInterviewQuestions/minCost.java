package ibmInterviewQuestions;

import java.util.*;

public class minCost {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(getMinimumCost(list));
    }
    public static long getMinimumCost(List<Integer> arr) {
        // Write your code here
        if(arr.size()==1){
            return arr.get(0);
        }
        List<Integer> ans = arr;
        Collections.sort(ans);

        int minCost = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<ans.size();i++){
            set.add(ans.get(i));
            minCost += set.size();
        }
        return minCost;
    }
}
