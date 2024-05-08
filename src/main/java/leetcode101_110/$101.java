package leetcode101_110;

import tree.base.TreeNode;

/**
 * @ClassName $101
 * @Description 101. 对称二叉树
 * @Author yunp
 * @Date 2020/4/21 16:42
 * @Version 1.0
 **/
public class $101 {

    public static void main(String[] args) {
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(2);
        t11.setLeft(t12); t11.setRight(t13);

        boolean symmetric = isSymmetric(t11);
        System.out.println(symmetric);
    }


    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }


    public static boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }

        return (t1.getVal() == t2.getVal())
                && isMirror(t1.getLeft(), t2.getRight())
                && isMirror(t1.getRight(), t2.getLeft());


    }



}
