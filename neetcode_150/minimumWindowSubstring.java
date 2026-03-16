import java.util.HashMap;

public class minimumWindowSubstring {
    public static void main(String[] args) {

    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character, Integer> map = new HashMap();
        for(int i =0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }
        int left = 0, right = 0;
        int counter = 0;
        int length = Integer.MAX_VALUE;
        int start = -1;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))>0){
                counter++;
            }
            map.put(s.charAt(right), map.get(s.charAt(right))-1);
            while(counter == t.length()){
                if(right-left+1<length){
                    length = right-left+1;
                    start = left;
                }
                map.put(s.charAt(left), map.get(s.charAt(left))+1);
                if(map.get(s.charAt(left))>0){
                    counter--;
                }
                left++;
            }
            right++;
        }
        if (start == -1) {
            return "";
        }
        return s.substring(start, start+length);
    }
}
