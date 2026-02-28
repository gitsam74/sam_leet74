import java.util.*;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            // Count all shorter people that get popped
            while (!stack.isEmpty() && heights[i] > stack.peek()) {
                stack.pop();
                ans[i]++;
            }

            // If someone taller or equal remains, they are visible
            if (!stack.isEmpty()) {
                ans[i]++;
            }

            stack.push(heights[i]);
        }

        return ans;
    }
}