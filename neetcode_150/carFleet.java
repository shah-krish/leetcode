//https://leetcode.com/problems/car-fleet/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class carFleet {
    public static void main(String[] args) {

    }
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length==1){
            return 1;
        }
        if(target==0){
            return 1;
        }
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> s1 = new Stack<>();
        int counter = 0;
        for(int i = 0; i < position.length; i++){
            double time = (double)(target - cars[i][0]) / cars[i][1];
            if(s1.isEmpty() || time > s1.peek()){
                s1.push(time);
            }
        }
        return s1.size();

    }
}
