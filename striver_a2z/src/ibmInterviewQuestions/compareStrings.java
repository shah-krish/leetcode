package ibmInterviewQuestions;

public class compareStrings {
    public static void main(String[] args) {
        String a= compareStrings("ba","ba","ac");
        System.out.println(a);
    }
    public static String compareStrings(String firstString, String secondString, String thirdString) {
        // Write your code here
        int order = 0;
        String answer = null; //This will store the final answer which is to be returned

        if(firstString.compareTo(secondString) < 0 && firstString.compareTo(thirdString) < 0){
            if(secondString.compareTo(thirdString) < 0){
                order = 123;
            }
            else{
                order = 132;
            }
        }
        if(secondString.compareTo(firstString) < 0 && secondString.compareTo(thirdString) < 0){
            if(firstString.compareTo(thirdString) < 0){
                order = 213;
            }
            else{
                order = 231;
            }
        }
        if(thirdString.compareTo(firstString) < 0 && thirdString.compareTo(secondString) < 0){
            if(secondString.compareTo(firstString) < 0){
                order = 321;
            }
            else{
                order = 312;
            }
        }
        System.out.println(order);
        switch (order){
            case 123:
                answer = firstString+secondString+thirdString;
                return answer;
            case 132:
                answer = firstString+thirdString+secondString;
                return answer;
            case 213:
                answer = secondString+firstString+thirdString;
                return answer;
            case 231:
                answer = secondString+thirdString+firstString;
                return answer;
            case 321:
                answer = thirdString+secondString+firstString;
                return answer;
            case 312:
                answer = thirdString+firstString+secondString;
                return answer;
        }
        return answer;
    }
}
