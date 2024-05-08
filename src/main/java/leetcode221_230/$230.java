package leetcode221_230;

import leetcode231_240.$236;
import tree.base.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class $230 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        int k = 1;
        int kthSmallest = kthSmallest2(root, k);
    }
    static int result = 0;
    public static int kthSmallest2(TreeNode root, int k) {

        dfs3(root,k);
        return result;
    }
    private static void dfs3(TreeNode root ,int k){
        if(root == null){
            return;
        }
        dfs3(root.left,k);
        if(k==0){
            return;
        }
        if(--k==0){
            result = root.val;
        }
        dfs3(root.right,k);
    }
    public static int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }


}
