import java.util.HashSet;

public class findMissingAndRepeatedValues {
    public static void main(String[] args) {

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int count = 0;
        int duplicate=0;
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length*grid.length;
        int sum = (n*(n+1))/2;
        for(int i =0; i<grid.length;i++){
            for(int j =0;j<grid.length;j++){
                if(set.contains(grid[i][j])){
                    duplicate = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                    count+=grid[i][j];
                }
            }
        }
        int missing = sum - count;
        return new int[]{duplicate,missing};
    }
}
