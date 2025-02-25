package cube.LeetCode.n14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Берём первое слово за основу

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Пока текущее слово не начинается с `prefix`
                prefix = prefix.substring(0, prefix.length() - 1); // Убираем последний символ
                if (prefix.isEmpty()) {
                    return ""; // Если ничего не осталось — префикса нет
                }
            }
        }
        return prefix;
    }
}
