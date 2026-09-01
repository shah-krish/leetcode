import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
public class groupAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }
            else{
                List<String> a1 = new ArrayList<>();
                a1.add(strs[i]);
                map.put(sorted, a1);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List value: map.values()){
            ans.add(value);
        }
        return ans;
    }
}