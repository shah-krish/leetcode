import java.util.*;
public class longestSuccessiveElements {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        System.out.println(longestSuccessiveElements(arr));
    }
    //https://www.naukri.com/code360/problems/longest-successive-elements_6811740

    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}

    /*
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        if(a.length<=1){
            return 1;
        }
        Arrays.sort(a);
        int counter = 1;
        int max = 1;
        for(int i = 0; i< a.length-1; i++){
            if(a[i]-a[i+1] == -1){
                counter ++;
            }
            else if (a[i] != a[i-1]){
                counter = 1;
            }
            max = Math.max(max,counter);
        }
        return max;
    }
}
     */