import java.util.*;
public class arrayLeaders {
    public static void main(String[] args) {

    }
    //https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]<=max){
                continue;
            }
            else{
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
