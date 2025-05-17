import java.util.*;
public class pascalsTriangle {
    public static void main(String[] args) {

    }

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList();
            for(int i =0 ; i<numRows; i++){
                if(i==0){
                    List<Integer> l1 = new ArrayList();
                    l1.add(1);
                    list.add(l1);
                }
                else if(i==1){
                    List<Integer> l2 = new ArrayList();
                    l2.add(1);
                    l2.add(1);
                    list.add(l2);
                }
                else{
                    List<Integer> l3 = new ArrayList();
                    //System.out.println(list.size());
                    //System.out.println(i);
                    List<Integer> prev = list.get(i-1);
                    l3.add(1);
                    for(int j =0 ; j<prev.size()-1; j++){
                        l3.add(prev.get(j)+prev.get(j+1));
                    }
                    l3.add(1);
                    list.add(l3);
                }
            }
            return list;
        }
}

