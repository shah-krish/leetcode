import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {

    }

        public int majorityElement(int[] nums) {
            int counter = 0;
            int m = 0;
            for(int i : nums){
                if(counter==0){
                    m = i;
                    counter = 1;
                }
                else if(m==i){
                    counter++;
                }
                else{
                    counter--;
                }
            }
            return m;
        }

}
