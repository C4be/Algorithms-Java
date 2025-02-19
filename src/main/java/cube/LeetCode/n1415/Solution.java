package cube.LeetCode.n1415;

class Solution {
    public String getHappyString(int n, int k) {
        int totalCount = 3 * (int) Math.pow(2, n - 1);
        if (k > totalCount)
            return ""; // Проверка, что k не превышает число возможных строк

        StringBuilder sb = new StringBuilder();
        char[] letters = { 'a', 'b', 'c' };

        k--; // Приводим k к 0-индексированному значению

        int prev = -1; // Индекс предыдущего символа (0 -> 'a', 1 -> 'b', 2 -> 'c')
        for (int i = 0; i < n; i++) {
            int groupSize = (int) Math.pow(2, n - 1 - i);
            int index = k / groupSize; // Вычисляем индекс буквы на этой позиции

            // Выбираем букву, избегая повтора предыдущей
            int letterIndex = 0;
            for (char c : letters) {
                if (letterIndex != prev) {
                    if (index == 0) {
                        sb.append(c);
                        prev = letterIndex;
                        break;
                    }
                    index--;
                }
                letterIndex++;
            }

            k %= groupSize; // Обновляем k для следующей позиции
        }

        return sb.toString();
    }
}
