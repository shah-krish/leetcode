import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        int index = 0;
        int counter = 0;
        helper(ans, index, l1, target, counter, candidates);
        return ans;
    }
    public void helper(List<List<Integer>> ans, int index, List<Integer> l1, int target, int counter, int[] candidates){
        if(index>=candidates.length){
            if(counter == target){
                ans.add(new ArrayList<>(l1));
            }
            return;
        }
        if(counter<=target){
            l1.add(candidates[index]);
            helper(ans, index, l1, target, counter+candidates[index], candidates);
            l1.remove(l1.size()-1);
        }
        helper(ans, index+1, l1, target, counter, candidates);
    }
}
