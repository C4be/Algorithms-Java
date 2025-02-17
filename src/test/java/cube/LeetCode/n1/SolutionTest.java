package cube.LeetCode.n1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;

public class SolutionTest {

    Solution s1 = new Solution();
    Random random = new Random();

    @Test
    void testFast_solution() {
        int count_test = random.nextInt(10_000); // Количество тестов
        int len = random.nextInt(10_000) + 10;   // Размер массива (от 10 до 1009)
    
        for (int t = 0; t < count_test; ++t) {
            int[] test_data = generateUniqueArray(len);
            int target = generateTarget(test_data);
    
            int[] expected = s1.slowSolution(test_data, target);
            int[] actual = s1.fastSolution(test_data, target);
    
            assertEquals(
                test_data[expected[0]] + test_data[expected[1]], 
                test_data[actual[0]] + test_data[actual[1]]
                );
        }
    }
    

    /**
     * Генерирует массив уникальных случайных чисел.
     *
     * @param size Размер массива.
     * @return Массив с уникальными значениями.
     */
    private int[] generateUniqueArray(int size) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int[] result = new int[size];

        for (int i = 0; i < size;) {
            int num = random.nextInt(20_000) + 1; // Числа от 1 до 20000
            if (uniqueNumbers.add(num)) { // Добавится только если число уникально
                result[i++] = num;
            }
        }
        return result;
    }

    /**
     * Генерирует корректный target, чтобы гарантированно была пара чисел.
     *
     * @param array Уникальный массив чисел.
     * @return Целевое число (сумма случайной пары чисел).
     */
    private int generateTarget(int[] array) {
        int idx1 = random.nextInt(array.length);
        int idx2;
        do {
            idx2 = random.nextInt(array.length);
        } while (idx1 == idx2); // Убедимся, что индексы разные

        return array[idx1] + array[idx2]; // Гарантированно существующая сумма
    }
}
