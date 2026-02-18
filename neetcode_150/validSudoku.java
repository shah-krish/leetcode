//https://leetcode.com/problems/valid-sudoku/
import java.util.HashSet;

public class validSudoku {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
      //horizontal check
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i< board.length;i++){
            set.clear();
            for(int j = 0; j<board.length; j++){
                if (board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                    return false;
                }
                else{
                    set.add(board[i][j]);
                }
            }
        }
        set.clear();
        //vertical check
        for(int i = 0; i< board.length;i++){
            set.clear();
            for(int j = 0; j<board.length; j++){
                if (board[j][i] == '.') continue;
                if(set.contains(board[j][i])){
                    return false;
                }
                else{
                    set.add(board[j][i]);
                }
            }
        }
        set.clear();
        //box check
        HashSet<Character>[] arr = new HashSet[9];
        for(int i = 0; i<arr.length; i++){
            arr[i] = new HashSet<>();
        }
        for(int i =0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                if (board[i][j] == '.') continue;
                int index = (i/3) * 3 + (j/3);
                if(arr[index].contains(board[i][j])){
                    return false;
                }
                arr[index].add(board[i][j]);
            }
        }
        return true;
     }
}
