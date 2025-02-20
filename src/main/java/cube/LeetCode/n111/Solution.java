package cube.LeetCode.n111;

class Solution {

    public int minDepth(TreeNode root) {
        int ans = minDepthRun(root, 1);
        return ans;
    }

    protected int minDepthRun(TreeNode root, int depth) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left_depth = (root.left != null) ? minDepthRun(root.left, depth) : 999_999;
        int right_depth = (root.right != null) ? minDepthRun(root.right, depth) : 999_999;

        return depth + Math.min(left_depth, right_depth);

    }

}