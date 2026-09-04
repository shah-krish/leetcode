//https://leetcode.com/problems/evaluate-reverse-polish-notation/
import java.util.Stack;

public class evaluateReversePolishNotation {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
            if ("-".equals(tokens[0]) || "+".equals(tokens[0]) || "*".equals(tokens[0]) || "/".equals(tokens[0])){
                return 0;
            }

            return Integer.valueOf(tokens[0]);
        }
        Stack<Integer> s1 = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            //tip from google: use "-".equals(tokens[i]) to avoid null pointer exception
            if(tokens[i].equals("-")){
                int b = (s1.pop());
                int a = (s1.pop());
                s1.push(a-b);
            }
            else if(tokens[i].equals("+")){
                int b = (s1.pop());
                int a = (s1.pop());
                s1.push(a+b);
            }
            else if(tokens[i].equals("*")){
                int b = (s1.pop());
                int a = (s1.pop());
                s1.push(a*b);
            }
            else if(tokens[i].equals("/")){
                int b = (s1.pop());
                int a = (s1.pop());
                s1.push(a/b);
            }
            else{
                //System.out.println(s1);
                s1.push(Integer.valueOf(tokens[i]));
            }
        }
        return s1.peek();
    }
}
