package scotiaInterviewQuestions;

import java.util.HashMap;

public class daysOfWeek {
    public static void main(String[] args) {
        System.out.println(solution("Wed",555));
    }
    public static String solution(String S, int K) {
        // Implement your solution here
        if(K<0){
            return null;
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mon",0);
        map.put("Tue",1);
        map.put("Wed",2);
        map.put("Thu",3);
        map.put("Fri",4);
        map.put("Sat",5);
        map.put("Sun",6);
        int a = K%7;
        int givenDay = map.get(S);
        int answer = (givenDay + a)%7;
        if (answer == 0)
                return "Mon";
        else if (answer ==1) {
                return "Tue";
        }
        else if(answer == 2){
            return "Wed";
        }
        else if(answer == 3){
            return "Thu";
        }
        else if(answer==4){
            return "Fri";
        }
        else if(answer == 5){
            return "Sat";
        }
        else if(answer == 6){
            return "Sun";
        }
        return null;
    }
}
