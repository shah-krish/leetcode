public class maxNestingDepthParanthesis {
    public static void main(String[] args) {

    }
    public static int maxDepth(String s) {
        int max = 0;
        int counter = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                counter++;
                max = Math.max(counter, max);
            }
            else if(s.charAt(i)==')'){
                counter--;
            }
        }
        return max;
    }
}
