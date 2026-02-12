import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
public class groupAnagrams {
    public static void main(String[] args) {

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if(strs.length==0){
            return ans;
        }
        if(strs.length == 1){
            List<String> l1 = new ArrayList<>();
            l1.add(strs[0]);
            ans.add(l1);
            return ans;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i <strs.length; i++){
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            //System.out.println(sortedWord);
            if(map.containsKey(sortedWord)){
                List<String> l1 = map.get(sortedWord);
                l1.add(strs[i]);
                map.put(sortedWord, l1);
            }
            else {
                List<String> l1 = new ArrayList<>();
                l1.add(strs[i]);
                map.put(sortedWord, l1);
            }
        }
        for (List<String> group : map.values()) {
            ans.add(group);
        }
        return ans;
    }
}
