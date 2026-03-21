import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class minStack {
    class MinStack {
        ArrayList<int[]> list;
        public MinStack() {
            list = new ArrayList<>();
        }

        public void push(int val) {
            if(list.isEmpty()){
                int[] arr = {val,val};
                list.add(arr);
            }
            else{
                int[] arr = {val,Math.min(val, list.get(list.size()-1)[1])};
                list.add(arr);
            }
        }

        public void pop() {
            list.remove(list.size()-1);
        }

        public int top() {
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1)[0];
        }

        public int getMin() {
            return list.get(list.size()-1)[1];
        }
    }
}
