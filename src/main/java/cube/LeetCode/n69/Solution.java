package cube.LeetCode.n69;

class Solution {

    public int mySqrt(int x) {
        if (x == 0) return 0;

        long left = 1, right = x; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return (int) right; 
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(2));
        System.out.println(s.mySqrt(4));
        System.out.println(s.mySqrt(8));
        System.out.println(s.mySqrt(9));
    }

}
