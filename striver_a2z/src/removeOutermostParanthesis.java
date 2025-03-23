public class removeOutermostParanthesis {
    public static void main(String[] args) {
        String a = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(a));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count1=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count1>0){
                    sb.append("(");
                }
                count1++;
            }
            else{
                count1--;
                if(count1>0){
                    sb.append(")");
                }
            }
        }
        return sb.toString();
    }
}
