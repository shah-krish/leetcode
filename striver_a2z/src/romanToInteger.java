import java.util.*;
public class romanToInteger {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        HashMap<Character,Integer> numbers = new HashMap<>();
        int answer = 0;
        numbers.put('I',1);
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);

        for(int i =0;i<s.length();i++){
            if (i > 0 && numbers.get(s.charAt(i)) > numbers.get(s.charAt(i - 1))) {
                answer += numbers.get(s.charAt(i))
                        - 2 * numbers.get(s.charAt(i - 1));
            }
            else {
                answer += numbers.get(s.charAt(i));
            }
        }

        return answer;
    }
}
