import java.util.ArrayList;

public class setMatrixZeros {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        boolean[] arr1 = new boolean[matrix.length];
        boolean[] arr2 = new boolean[matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr1[i] = true;
                    arr2[j] = true;
                }
            }
        }
        for(int i =0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(arr1[i] == true || arr2[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
