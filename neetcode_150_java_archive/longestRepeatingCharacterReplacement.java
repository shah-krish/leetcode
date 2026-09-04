//https://leetcode.com/problems/longest-repeating-character-replacement/

import java.util.HashMap;
import java.util.HashSet;

public class longestRepeatingCharacterReplacement {
    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        if(s.length()<=1){
            return s.length();
        }
        int left = 0, right = 0;
        int target = k;
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int top = 1;
        while(right<s.length()){
          int window = right-left+1;
          if(window-top<=k){
              right++;
              if(map.containsKey(s.charAt(right))){
                  map.put(s.charAt(right), map.get(s.charAt(right))+1);
                  top = Math.max(top, map.get(s.charAt(right)));
              }
              else{
                  map.put(s.charAt(right),1);
              }

          }
          else{
              map.put(s.charAt(left), map.get(s.charAt(left))-1);
              left++;
          }
          answer = Math.max(answer, window);
        }
        return answer;
    }
}
