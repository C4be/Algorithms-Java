package cube.LeetCode.n14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    void fromLeetCodeFlowers() {
        String[] strs = new String[] { "flower", "flow", "flight" };
        assertEquals("fl", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeFlowers_len2() {
        String[] strs = new String[] { "fl", "fl", "fl" };
        assertEquals("fl", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeFlowers_len3() {
        String[] strs = new String[] { "flo", "flo", "flo" };
        assertEquals("flo", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty() {
        String[] strs = new String[] { "flower", "root", "tour" };
        assertEquals("", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty_test1() {
        String[] strs = new String[] { "aa", "aa", "ab" };
        assertEquals("a", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty_test2() {
        String[] strs = new String[] { "aa", "ab", "aa" };
        assertEquals("a", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty_test3() {
        String[] strs = new String[] { "a", "a", "b" };
        assertEquals("", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty_test4() {
        String[] strs = new String[] { "a", "a", "a" };
        assertEquals("a", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty_test5() {
        String[] strs = new String[] { "c", "c" };
        assertEquals("c", s.longestCommonPrefix(strs));
    }

    @Test
    void fromLeetCodeEmpty_test6() {
        String[] strs = new String[] { "aac", "a", "ccc" };
        assertEquals("", s.longestCommonPrefix(strs));
    }

}
