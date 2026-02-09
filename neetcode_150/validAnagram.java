import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/
public class validAnagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        int[] frequency = new int[26];
        for(int i = 0; i<s.length(); i++){
            frequency[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<t.length(); i++){
            frequency[t.charAt(i) - 'a']--;
        }
        for(int i : frequency){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
/* ALT SOLUTION 1
 public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i = 0; i<s1.length; i++){
            if(s1[i] != t1[i]){
                return false;
            }
        }
        return true;
    }
 */

/* ALT SOLUTION 2
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length();i ++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for(int i = 0; i<t.length();i ++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            else{
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
        }
        Collection<Integer> frequencies = map.values();
        ArrayList<Integer> a1 = new ArrayList<>(frequencies);
        for(int i = 0; i < frequencies.size(); i++){
            if(a1.get(i) != 0){
                return false;
            }
        }
        return true;

    }
 */