package cube.LeetCode.n48;

public class Solution {
    public void rotate(int[][] matrix) {
        //reverseRows(matrix);
        transponse(matrix);
        reverseRows(matrix);
    }

    public void transponse(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m[0].length; j++) {
                swap(m, i, j, i, j);
            }
        }
    }

    private void swap(int[][] m, int i1, int j1, int i2, int j2) {
        int temp = m[i1][j1];
        m[i1][j1] = m[j2][i2];
        m[j2][i2] = temp;
    }

    public void reverseRows(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[0].length / 2; col++) {
                swap(m, row, col, m[0].length - 1 - col, row);
            }
        }
    }


}
