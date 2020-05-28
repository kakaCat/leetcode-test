package leetcode221_230;

import tree.base.TreeNode;

/**
 * @ClassName $226
 * @Description 226. 翻转二叉树
 * @Author yunp
 * @Date 2020/5/21 17:57
 * @Version 1.0
 **/
public class $226 {

    public static void main(String[] args) {




    }


    public static TreeNode invertTree(TreeNode root) {
        if(root ==  null){
            return null;
        }
        TreeNode right = invertTree(root.getRight());
        TreeNode left = invertTree(root.getLeft());

        root.setRight(left);
        root.setLeft(right);
        return root;
    }

}
