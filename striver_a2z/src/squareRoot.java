public class squareRoot {
    public static void main(String[] args) {
        System.out.println(floorSqrt(28));
    }
   static int floorSqrt(int n) {
        int lower = 0, upper = 0;
        if(n<=3){ //0 not in test case
            return 1;
        }
        //for every other element square root should be less than equal to half.
        //if (n/2)^2 > n, we do n/4 and so on
        int k = n;
        while(k>1){
            k = k/2;
            System.out.println(k);
            if(k*k==n){
                return k;
            }
            else if(k*k>n){
                continue;
            }
            else if(k*k<n){
                lower = k;
                upper = 2*k;
                break;
            }
        }
       //System.out.println(lower);
       //System.out.println(upper);
        for(int i = lower; i<=upper;i++) {
            //System.out.println(i);
            if (i * i > n) {
                return i - 1;
            }
        }
        return upper;
    }
}
