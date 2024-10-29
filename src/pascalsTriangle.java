import java.util.*;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    //IMPROVED READIBILITY

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Handle the case for numRows == 0 explicitly
        if (numRows <= 0) {
            return triangle;
        }

        // Generate each row of Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            // First and last elements are always 1
            row.add(1);

            // Fill in the interior values
            if (i > 1) {
                List<Integer> previousRow = triangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(previousRow.get(j - 1) + previousRow.get(j));
                }
            }

            // Last element is always 1
            if (i > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

}

    /*
    INITIAL CODE. WORKS FAST BUT READABILITY IS POOR
    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=2;i++){
            ArrayList<Integer> innerList = new ArrayList<>();
            for(int j=0;j<i;j++){
                innerList.add(1);
            }
            list.add(innerList);
            if(numRows==1)
                return list;
        }
        if(numRows==2)
            return list;
        int counter = 1;
        while(counter<numRows-1){
            List<Integer> l1 = list.get(counter);
            List<Integer> l2 = new ArrayList<>();
            l2.add(1);
            for(int i =0; i<l1.size()-1;i++){
                l2.add(l1.get(i)+l1.get(i+1));
            }
            l2.add(1);
            list.add(l2);
            counter ++;
        }
        return list;
    }
}

     */
