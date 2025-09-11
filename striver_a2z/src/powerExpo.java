public class powerExpo {
    public static void main(String[] args) {

    }
    public double myPow(double x, int n) {
        double ans = 1;
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1 / (x * helper(x, -(n + 1), ans));
            }
            n = -n;
            double result = helper(x, n, ans);
            return 1 / result;
        }
        return helper(x, n, ans);
    }

    public static double helper(double x, int n, double ans) {
        if (n == 0) {
            return ans;
        }
        if (n % 2 != 0) {
            ans = ans * x;
            return helper(x, n - 1, ans);
        } else {
            x = x * x;
            n = n / 2;
            return helper(x, n, ans);
        }
    }
}
