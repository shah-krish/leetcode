import java.util.*;

public class reverseWordsString {
    public static void main(String[] args) {
        String s  = "  hello world  ";
        reverseWords(s);
    }
    public static String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(split));
        StringBuilder sb = new StringBuilder();
        for(String i : split){
            sb.append(i);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}



































//    public static String reverseWords(String s) {
//        StringBuilder sb = new StringBuilder();
//        int endIndex = s.length();
//        for(int i =s.length()-1 ; i>=0;i--){
//
////            if(s.charAt(i)==' '  i==0){
////                startIndex = i;
////                sb.append(s.substring(startIndex,endIndex+1));
////                endIndex = i-1;
////                sb.append(" ");
////            }
//            if(s.charAt(i)==' ' && i-1>=0 && s.charAt(i-1)!=' '){
//                endIndex = i;
//            }
//            else if(s.charAt(i)!=' ' && i-1>=0 && s.charAt(i-1)==' ' || (i==0 && s.charAt(0)!=' ')){
//                sb.append(s.substring(i,endIndex));
//                sb.append(" ");
//            }
//            else if(s.charAt(i)==' ' && i-1>=0 && s.charAt(i-1)==' '){
//                continue;
//            }
//        }
//        sb.deleteCharAt(sb.length()-1);
//        return sb.toString();
//    }

