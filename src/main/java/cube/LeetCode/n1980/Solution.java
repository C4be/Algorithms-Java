package cube.LeetCode.n1980;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution { // TODO: add fast example

    public String findDifferentBinaryString(String[] nums) {

        int n = nums[0].length();
        Queue<String> q = new LinkedList<>();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                q.add("");
            }
            
            int capacity = q.size();
            while (capacity != 0) {
                String cur = q.poll();
                q.add(cur + '0');
                q.add(cur + '1');
                capacity--;
            }

            if (i == n - 1) {
                while (!q.isEmpty()) {
                    set.add(q.poll());
                }
            }
            
        }

        for (String el : nums) {
            if (set.contains(el)) {
                set.remove(el);
            }
        }

        return set.stream().findFirst().orElse("null");

    }

    public String fastSolution(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; ++i) {
            sb.append((nums[i].charAt(i) == '0') ? '1' : '0');
        }
        return sb.toString();
    }

}