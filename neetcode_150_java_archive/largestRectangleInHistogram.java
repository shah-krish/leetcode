import java.util.Arrays;
import java.util.Stack;

public class largestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        largestRectangleArea(arr);
    }
    public static int largestRectangleArea(int[] heights) {
        if(heights.length == 1){
            return heights[0];
        }
        int[] range = new int[heights.length];
        Stack<Integer> s1 = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!s1.isEmpty() && heights[i] < heights[s1.peek()]){
                range[s1.peek()] = i - s1.peek() -1;
                s1.pop();
            }
            s1.push(i);
        }
        while(!s1.isEmpty()){
            range[s1.peek()] = heights.length - s1.peek() -1;
            s1.pop();
        }
        for(int i = heights.length-1; i>=0; i--){
            while(!s1.isEmpty() && heights[i] < heights[s1.peek()]){
                range[s1.peek()] = range[s1.peek()] + (s1.peek()-i-1);
                s1.pop();
            }
            s1.push(i);
        }
        while(!s1.isEmpty()){
            range[s1.peek()] = range[s1.peek()] + s1.peek();
            s1.pop();
        }
        System.out.println(Arrays.toString(range));
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<heights.length; i++){
            max = Math.max(max, heights[i] * (range[i]+1));
        }
        //System.out.println(max);
        return max;
    }
}
