import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[][] godSolution = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};


        int[][] badSolution = {
                {4, 7, 5, 9, 2, 6, 8, 1, 3},
                {1, 5, 4, 3, 9, 6, 8, 7, 2},
                {7, 8, 5, 9, 4, 1, 6, 3, 2},
                {8, 9, 4, 3, 2, 5, 7, 1, 6},
                {7, 3, 9, 2, 5, 8, 1, 4, 6},
                {4, 2, 9, 1, 7, 6, 8, 5, 3},
                {4, 8, 2, 5, 7, 3, 9, 6, 1},
                {7, 6, 5, 3, 8, 1, 4, 2, 9},
                {2, 4, 9, 8, 5, 3, 6, 1, 7}
        };

        System.out.println(isValid(godSolution));

    }

    static boolean isValid(int[][] board) {

        boolean isValid = true;

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 8; c++) {
                for (int c2 = c + 1; c2 < 9; c2++) {
                    if (board[r][c] == board[r][c2])
                        isValid = false;
                }
            }
        }


        for (int c = 0; c < 9; c++) {
            for (int r = 0; r < 8; r++) {
                for (int r2 = r + 1; r2 < 9; r2++) {
                    if (board[r][c] == board[r2][c])
                        isValid = false;
                }
            }
        }


        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                for (int pos = 0; pos < 8; pos++) {
                    for (int pos2 = pos + 1; pos2 < 9; pos2++) {
                        if (board[r + pos % 3][c + pos / 3] == board[r + pos2 % 3][c + pos2 / 3])
                            isValid = false;
                    }
                }
            }
        }

        return isValid;
    }


}
