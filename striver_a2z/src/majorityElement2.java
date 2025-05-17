import java.util.*;
public class majorityElement2 {
    public static void main(String[] args) {

        }



    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        int number1 = 0;
        int counter1 = 0;
        int number2 = 0;
        int counter2=0;
        int limit = nums.length/3;

        for(int i = 0; i<nums.length;i++){
            if(nums[i] == number1){
                counter1++;
            }
            else if(nums[i] == number2){
                counter2++;
            }
            else if(counter1 == 0){
                number1 = nums[i];
                counter1=1;
            }
            else if(counter2 == 0 && nums[i] != number1){
                number2 = nums[i];
                counter2 = 1;
            }


            else{
                counter1--;
                counter2--;
            }
        }
        //System.out.println(number1);
        //System.out.println(number2);
        int c1 = 0; int c2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == number1){
                c1++;
            }
            if(nums[i] == number2){
                c2++;
            }
        }
        if(c1>limit){
            list.add(number1);
        }
        if(c2>limit && number2!=number1){
            list.add(number2);
        }
        return list;
    }

}
