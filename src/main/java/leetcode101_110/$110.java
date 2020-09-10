package leetcode101_110;

import tree.base.TreeNode;

/**
 * @ClassName $110
 * @Description 110. 平衡二叉树
 * @Author yunp
 * @Date 2020/8/28 10:39
 * @Version 1.0
 **/
public class $110 {


    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {

        return height(root) >=0;
    }

    public static int height(TreeNode root){

        if(root==null){
            return 0;
        }

        int left = height(root.getLeft());

        int right = height(root.getRight());

        if(left == -1|| right == -1 || Math.abs(left-right)>1){
            return -1;
        }

        return Math.max(left, right)+1;

    }



}
