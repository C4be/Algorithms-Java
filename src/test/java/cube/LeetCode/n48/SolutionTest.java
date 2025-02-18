package cube.LeetCode.n48;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    void test_1() {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] excpect = new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
        s.rotate(matrix);
        boolean res = matrix_check(excpect, matrix);
        assertTrue(res);
    }

    @Test
    void test_2() {
        int[][] matrix = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        int[][] excpect = new int[][] { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
        s.rotate(matrix);
        assertTrue(matrix_check(excpect, matrix));
    }

    boolean matrix_check(int[][] m1, int[][] m2) {

        if (!isEqualsSizing(m1, m2))
            throw new IllegalArgumentException("Размеры матриц не равны!");

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean isEqualsSizing(int[][] m1, int[][] m2) {
        return m1.length == m2.length && m1[0].length == m2.length;
    }

}
