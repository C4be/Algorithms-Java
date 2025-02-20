package cube.LeetCode.n111;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class SolutionTest { // TODO: доделать тест

    TreeNode construct(List<Integer> nodes_values) {
        int val = nodes_values.get(0);
        nodes_values.remove(0);
        TreeNode constructNode = buildBinaryTree(nodes_values, val);

        return constructNode;
    }

    TreeNode buildBinaryTree(List<Integer> nodes_values, Integer cur_value) {

        if (cur_value == null)
            return null;

        TreeNode head = new TreeNode(cur_value);

        if (nodes_values.isEmpty()) {
            return head;
        }

        Integer left_value = null, right_value = null;

        // if (head.left != null) {
        left_value = nodes_values.get(0);
        nodes_values.remove(0);
        // }

        // if (head.right != null) {
        right_value = nodes_values.get(0);
        nodes_values.remove(0);
        // }

        // if (head.left != null) {
        head.left = buildBinaryTree(nodes_values, left_value);
        // }

        // if (head.right != null) {
        head.right = buildBinaryTree(nodes_values, right_value);
        // }
        return head;

    }

    public static void main(String[] args) {
        SolutionTest s = new SolutionTest();
        List<Integer> li = new ArrayList<>(Arrays.asList(3, 9, 20, null, null, 15, 7));
        TreeNode head = s.construct(li);

        printTree(head);
    }

    public static void printTree(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node == null ? "null " : node.val + " ");

            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
    }

    @Test
    void test_from_leetcode_1() {
        
        Solution ss = new Solution();

        TreeNode test = construct(new ArrayList<>(Arrays.asList(
            3, 9, 20, null, null, 15, 7
        )));

        assertEquals(2, ss.minDepth(test));
    }

    @Test
    void test_from_leetcode_2() {
        
        Solution ss = new Solution();

        TreeNode test = construct(new ArrayList<>(Arrays.asList(
            2,null,3,null,4,null,5,null,6
        )));

        assertEquals(5, ss.minDepth(test));
    }

    @Test
    void test_from_leetcode_3() {
        
        Solution ss = new Solution();

        TreeNode test = construct(new ArrayList<>(Arrays.asList(
            1,2,3
        )));

        assertEquals(2, ss.minDepth(test));
    }

    @Test
    void test_from_leetcode_4() { // TODO: конструктор не работает

        
        Solution ss = new Solution();
        List<Integer> nn = new ArrayList<>();
        nn.add(null);
        TreeNode test = construct(nn);

        assertEquals(0, ss.minDepth(test));
    }



}
