package cube.LeetCode.n1079;

import java.util.HashMap;

/**
 * Класс для вычисления количества возможных непустых последовательностей букв
 * из заданных плиток.
 */
class Solution {
    // Хеш-таблица для кэширования результатов по частотному профилю букв
    private HashMap<String, Integer> memo = new HashMap<>();

    /**
     * Основной метод для вычисления количества возможных последовательностей.
     *
     * @param tiles строка, содержащая буквы на плитках
     * @return количество возможных последовательностей
     */
    public int numTilePossibilities(String tiles) {
        return fastSolution(tiles);
    }

    /**
     * Метод, который подготавливает данные для рекурсивного подсчета.
     * Создает карту частот символов и передает ее в рекурсивный метод.
     *
     * @param tiles строка с буквами плиток
     * @return количество возможных последовательностей
     */
    private int fastSolution(String tiles) {
        // Подсчет частот букв в строке
        HashMap<Character, Integer> cnts = new HashMap<>();
        for (char ch : tiles.toCharArray()) {
            cnts.put(ch, cnts.getOrDefault(ch, 0) + 1);
        }
        return recursiveProcess(cnts);
    }

    /**
     * Рекурсивный метод для перебора всех возможных последовательностей.
     * Использует кэширование для ускорения вычислений.
     *
     * @param cnts карта с количеством оставшихся букв
     * @return количество возможных последовательностей
     */
    private int recursiveProcess(HashMap<Character, Integer> cnts) {
        // Генерируем уникальный ключ для кэша, например "321" для "AAABBC"
        String key = createKey(cnts);

        // Проверяем, есть ли уже результат в кэше
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int sum = 0;

        // Перебираем все доступные буквы
        for (char ch : cnts.keySet()) {
            if (cnts.get(ch) == 0)
                continue; // Пропускаем буквы, которых уже нет

            sum++; // Учитываем текущую букву

            // Уменьшаем количество текущей буквы и вызываем рекурсию
            cnts.put(ch, cnts.get(ch) - 1);
            sum += recursiveProcess(cnts);
            cnts.put(ch, cnts.get(ch) + 1); // Восстанавливаем после рекурсии
        }

        // Кэшируем результат
        memo.put(key, sum);
        return sum;
    }

    /**
     * Генерирует строковый ключ на основе частотного профиля букв.
     * Пример: для "AAABBC" и "CCCBBA" создаст одинаковый ключ "321".
     *
     * @param cnts карта количества букв
     * @return строковый ключ, например "321"
     */
    private String createKey(HashMap<Character, Integer> cnts) {
        // Получаем массив частот, сортируем по убыванию (чтобы "AAB" и "ABB" давали
        // один ключ)
        int[] freq = cnts.values().stream().filter(v -> v > 0).sorted((a, b) -> b - a).mapToInt(i -> i).toArray();
        StringBuilder sb = new StringBuilder();
        for (int num : freq) {
            sb.append(num);
        }
        return sb.toString();
    }

    /**
     * Тестирование метода numTilePossibilities с разными входными значениями.
     */
    public static void main(String[] args) {
        Solution solver = new Solution();
        System.out.println(solver.numTilePossibilities("AAB")); // Вывод: 8
        System.out.println(solver.numTilePossibilities("AAABBC")); // Вывод: 188
        System.out.println(solver.numTilePossibilities("CCCBBA")); // Вывод: 188 (такой же, как AAABBC)
        System.out.println(solver.numTilePossibilities("V")); // Вывод: 1
    }
}