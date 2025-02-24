package cube.LeetCode.n136;

class Solution {

    /*
     * A^A=0
     * A^B^A=B
     * (A^A^B) = (B^A^A) = (A^B^A) = BThis shows that position doesn't matter.
     * Similarly , if we see ,a^a^a......... (even times)=0 and a^a^a........(odd times)=a
    */

    public int singleNumber(int[] nums) {
        int s = 0;
        for (int el : nums) {
            s ^= el;
        }
        return s;
    }
}