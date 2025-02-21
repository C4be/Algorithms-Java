package cube.LeetCode.n13;

import java.util.HashMap;

class Solution {

    static final HashMap<Character, Integer> romansValus = new HashMap<>(); 

    static {   // static init values
        romansValus.put('I', 1);
        romansValus.put('V', 5);
        romansValus.put('X', 10);
        romansValus.put('L', 50);
        romansValus.put('C', 100);
        romansValus.put('D', 500);
        romansValus.put('M', 1_000);
    }

    public int romanToInt(String s) {
        int last_index = s.length() - 1;

        char prev = '!';
        int numberFromRoman = 0;
        for (int i = last_index; i >= 0; --i) {
            char current_char = s.charAt(i);

            if (i == last_index) { // first iteration
                prev = current_char;
                numberFromRoman += romansValus.get(current_char);
                continue;
            }

            int option = 1;
            if (romansValus.get(current_char) < romansValus.get(prev)) {
                option = -1;
            }

            numberFromRoman += option * romansValus.get(current_char);
            prev = current_char;
        }

        return numberFromRoman;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }

}