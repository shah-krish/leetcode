import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {


    }
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i = 0; i < s1.length; i++){
            if(s1[i]!=t1[i]){
                return false;
            }
        }
        return true;
    }
}
/*
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if(value!=0){
                return false;
            }
        }
        return true;
    }
 */