public class rotateString {
    public static void main(String[] args) {

    }
    public boolean rotateString(String s, String goal) {
        //when you concatenate a string with itself (s + s), it contains all possible rotations of the original string.
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}
