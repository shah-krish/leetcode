public class stringToInteger {
    public static void main(String[] args) {
        String s = "     -042";
        System.out.println(myAtoi(s));
    }
    //optimizations possible: direct += double/int instead of stringbuilder
    //>0 <9 single digit instead of Character.isDigit
    public static int myAtoi(String s) {
        int max = Integer.MAX_VALUE; //max range
        int min = Integer.MIN_VALUE; //min range
        //System.out.println(min);
        boolean isValid = false; //starting check
        boolean foundNumber = false;
        boolean isNegative = false;
        boolean foundSign = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                continue;
            }
            if(Character.isDigit(s.charAt(i))||s.charAt(i)=='+'||s.charAt(i)=='-'){
                isValid = true;
                break;
            }
            else if(Character.isAlphabetic(s.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(!isValid){
            return 0;
        }
        for(int i = 0; i<s.length();i++){
            if((s.charAt(i)=='+' || s.charAt(i)=='-'||s.charAt(i)==' ') && !foundNumber && !foundSign){
                if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                    foundSign = true;
                }
                if(s.charAt(i)=='-') {
                    isNegative = true;
                }
            }
            else if(s.charAt(i)=='0' && !foundNumber){
                foundNumber = true;
            }
            else if(!Character.isDigit(s.charAt(i))){
                break;
            }
            else{
                sb.append(s.charAt(i));
                foundNumber = true;
            }
        }
        if(sb.isEmpty()){
            return 0;
        }
        String n = sb.toString();
        System.out.println(n);
        double pAns = Double.valueOf(n);

        if(isNegative){
            pAns = 0-pAns;
        }
        if(pAns>max){
            pAns = max;
        }
        else if(pAns<min){
            pAns = min;
        }
        //System.out.println(pAns);
        int ans = (int) pAns;
        return ans;
    }
}
