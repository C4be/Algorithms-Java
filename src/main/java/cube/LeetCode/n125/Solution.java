package cube.LeetCode.n125;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch) || Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        int l = 0, r = sb.length() - 1;
        
        // test
        //System.out.println(sb.toString());

        while (l < r) {
            if (sb.charAt(l) != sb.charAt(r)) {
                return false;
            }
            ++l;
            --r;
        }

        return true;
    }
}
