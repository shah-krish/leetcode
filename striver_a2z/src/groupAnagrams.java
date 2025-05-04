import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String s1 = String.valueOf(temp);

            if(!map.containsKey(s1)){
                List<String> l1 = new ArrayList<>();
                l1.add(strs[i]);
                map.put(s1, l1);
                //System.out.println(s1 + " " + l1);
            }
            else{
                List<String> l2 = map.get(s1);
                l2.add(strs[i]);
                map.put(s1,l2);
                //System.out.println(s1 + " " + l2);
            }
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            answer.add(entry.getValue());
        }
        return answer;
    }
}
