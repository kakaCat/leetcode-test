package leetcode111_120;

import leetcode101_110.$105;

import java.util.ArrayList;
import java.util.List;

public class $114 {


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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);


        flatten(root);

        // 验证展开后的链表
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // 递归展开左子树和右子树
        flatten(root.left);
        flatten(root.right);

        // 保存右子树，将左子树置为空
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;

        // 找到展开后的链表的末尾
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }

        // 将保存的右子树连接到链表末尾
        current.right = right;
    }



//    public static void flatten2(TreeNode root) {
//        List<TreeNode> list = new ArrayList();
//        dfs(root,list);
//        int len = list.size();
//        for(int i = 1;i<len;i++){
//            TreeNode prev = list.get(i-1),cur = list.get(i);
//            prev.left = null;
//            prev.right = cur;
//        }
//    }
//    public static void dfs(TreeNode root,List<TreeNode> list){
//        if(root == null){
//            return;
//        }
//        list.add(root);
//        dfs(root.left,list);
//        dfs(root.right,list);
//    }

}
