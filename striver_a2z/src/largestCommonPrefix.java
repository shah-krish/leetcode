import java.util.*;
public class largestCommonPrefix {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int first = 0, last = strs.length-1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<Math.min(strs[first].length(),strs[last].length());i++){
            if(strs[first].charAt(i)!=strs[last].charAt(i)){
                return sb.toString();
            }
            sb.append(strs[first].charAt(i));
        }
        return sb.toString();
    }
}
