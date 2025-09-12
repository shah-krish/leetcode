public class stringToInteger {
    public static void main(String[] args) {
        String s = "     -042";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        boolean isLeadingWhiteSpace = true;
        boolean isLeadingSign = true;
        long ans = 0;
        int sign = 1;
        return helper(s,ans,isLeadingWhiteSpace,isLeadingSign, sign);
    }
    public static int helper(String s, long ans, boolean isLeadingWhiteSpace, boolean isLeadingSign, int sign){
        if(s.length()==0){
            return (int) ans * sign;
        }
        if(isLeadingWhiteSpace && s.charAt(0) == ' '){
            return helper(s.substring(1), ans, isLeadingWhiteSpace,isLeadingSign, sign);
        }
        else if(isLeadingSign && (s.charAt(0) == '-' || s.charAt(0) == '+')){
            if(s.charAt(0) == '+'){
                isLeadingWhiteSpace = false;
                isLeadingSign = false;
                return helper(s.substring(1), ans, isLeadingWhiteSpace,isLeadingSign, sign);
            }
            else{
                sign = -1;
                isLeadingWhiteSpace = false;
                isLeadingSign = false;
                return helper(s.substring(1), ans, isLeadingWhiteSpace,isLeadingSign, sign);
            }
        }
        else if(!isLeadingSign && (s.charAt(0) == '-' || s.charAt(0) == '+') || !Character.isDigit(s.charAt(0))){
            return (int) ans * sign;
        }
        else{
            isLeadingWhiteSpace = false;
            isLeadingSign = false;
            int digit = s.charAt(0) - '0';
            if (sign == 1) {
                if (ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 && digit > 8)) {
                    return Integer.MIN_VALUE;
                }
            }
            ans = (ans*10) + s.charAt(0) - '0';
            return helper(s.substring(1), ans, isLeadingWhiteSpace,isLeadingSign, sign);
        }
    }

































//    //optimizations possible: direct += double/int instead of stringbuilder
//    //>0 <9 single digit instead of Character.isDigit
//    public static int myAtoi(String s) {
//        int max = Integer.MAX_VALUE; //max range
//        int min = Integer.MIN_VALUE; //min range
//        //System.out.println(min);
//        boolean isValid = false; //starting check
//        boolean foundNumber = false;
//        boolean isNegative = false;
//        boolean foundSign = false;
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<s.length(); i++){
//            if(s.charAt(i)==' '){
//                continue;
//            }
//            if(Character.isDigit(s.charAt(i))||s.charAt(i)=='+'||s.charAt(i)=='-'){
//                isValid = true;
//                break;
//            }
//            else if(Character.isAlphabetic(s.charAt(i))){
//                isValid = false;
//                break;
//            }
//        }
//        if(!isValid){
//            return 0;
//        }
//        for(int i = 0; i<s.length();i++){
//            if((s.charAt(i)=='+' || s.charAt(i)=='-'||s.charAt(i)==' ') && !foundNumber && !foundSign){
//                if(s.charAt(i)=='+' || s.charAt(i)=='-'){
//                    foundSign = true;
//                }
//                if(s.charAt(i)=='-') {
//                    isNegative = true;
//                }
//            }
//            else if(s.charAt(i)=='0' && !foundNumber){
//                foundNumber = true;
//            }
//            else if(!Character.isDigit(s.charAt(i))){
//                break;
//            }
//            else{
//                sb.append(s.charAt(i));
//                foundNumber = true;
//            }
//        }
//        if(sb.isEmpty()){
//            return 0;
//        }
//        String n = sb.toString();
//        System.out.println(n);
//        double pAns = Double.valueOf(n);
//
//        if(isNegative){
//            pAns = 0-pAns;
//        }
//        if(pAns>max){
//            pAns = max;
//        }
//        else if(pAns<min){
//            pAns = min;
//        }
//        //System.out.println(pAns);
//        int ans = (int) pAns;
//        return ans;
//    }
}
