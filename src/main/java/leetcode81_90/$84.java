package leetcode81_90;

import java.util.Stack;

public class $84 {

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println("柱状图中最大的矩形面积：" + result);
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n]; // 记录每个柱子左边界的索引
        int[] right = new int[n]; // 记录每个柱子右边界的索引
        Stack<Integer> stack = new Stack<>(); // 使用栈来辅助计算

        // 计算每个柱子的左边界
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        stack.clear();

        // 计算每个柱子的右边界
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;
            stack.push(i);
        }

        int maxArea = 0;

        // 计算每个柱子对应的矩形面积，并更新最大面积
        for (int i = 0; i < n; i++) {
            int area = (right[i] - left[i] + 1) * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }



}
