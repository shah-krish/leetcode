import static java.util.Collections.swap;

public class rotateImage {
    public static void main(String[] args) {

    }
    /*
    better approach is transpose array and reverse every row! (in-place solution)
     */
    public void rotate(int[][] matrix) {
        int n  = matrix.length;
        for(int i =0; i<n-1;i++){
            for(int j = i+1; j<n;j++){
                swap(matrix,matrix[i][j],matrix[j][i]);
            }
        }
        for(int i =0; i<n;i++){
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
    public static void swap(int[][] nums, int a, int b) {
        int temp = nums[a][b];
        nums[a][b] = nums[b][a];
        nums[b][a] = temp;
    }
    /* brute force approach
     static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
     */
}
