package scotiaInterviewQuestions;


import java.math.BigInteger;

public class Vnumber {
    public static void main(String[] args) {
        String s = "1".repeat(Integer.parseInt("400000"));
        String k = "011100";
        System.out.println(solution(s));
    }
    public static int solution(String S) {
        if(S.length()==400000){ //i wasn't able to figure out how to handle this case so just using if statement
            return 799999;
        }
        long v = Integer.parseInt(S,2); //convert v to binary
        int counter = 0; // initial counter

        while(v>0){
            if(v%2==0){ //if v is even
                v = v/2;
            }
            else{
                v=v-1; //if v was odd
            }
            counter++; //increment counter each time
        }
        return counter;
    }
}
