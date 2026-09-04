import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/description/
public class dailyTemperatures {
    public static void main(String[] args) {

    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<int[]> s1 = new Stack<>();
        for(int i = 0; i<temperatures.length-1; i++){
            if(temperatures[i+1]>temperatures[i]){
                answer[i] = 1;
                if(!s1.isEmpty()){
                    while(!s1.isEmpty() && temperatures[i+1]>s1.peek()[0]){
                        answer[s1.peek()[1]] = i+1 - s1.peek()[1];
                        s1.pop();
                    }
                }
            }
            else{
                int[]a = {temperatures[i], i};
                s1.push(a);
            }

        }
        while(!s1.isEmpty()){
            if(temperatures[temperatures.length-1]>s1.peek()[0]){
                answer[s1.peek()[1]] = temperatures.length-s1.peek()[1]-1;
                s1.pop();
            }
            else{
                s1.pop();
            }
        }
        answer[answer.length-1] = 0;
        return answer;
    }
}
