// https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.HashMap;
import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int answer = 0;
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))>=left){
               left = map.get(s.charAt(right))+1;
            }
            map.put(s.charAt(right), right);
            answer = Math.max(right-left+1, answer);
            right++;

        }
        return answer;
    }
}
/* FIRST OWN SOLUTION
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int answer = 0;
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                answer = Math.max(set.size(),answer);
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return answer;
    }
 */
