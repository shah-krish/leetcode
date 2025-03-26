import java.util.*;
public class isomorphicStrings {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        Boolean a = true;
        Boolean b = true;
        for(int i = 0; i<Math.min(s.length(), t.length()); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!= t.charAt(i)){
                    a = false;
                }
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        for(int i = 0; i<Math.min(s.length(), t.length()); i++){
            if(map1.containsKey(t.charAt(i))){
                if(map1.get(t.charAt(i))!= s.charAt(i)){
                    b = false;
                }
            }
            else{
                map1.put(t.charAt(i),s.charAt(i));
            }
        }
        //System.out.println(a);
        //System.out.println(b);
        return a && b;
    }
}
