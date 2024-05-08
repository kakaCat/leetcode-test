package leetcode101_110;

import tree.base.TreeNode;

/**
 * @ClassName $104
 * @Description 104. 二叉树的最大深度
 * @Author yunp
 * @Date 2020/4/21 17:02
 * @Version 1.0
 **/
public class $104 {

    public static void main(String[] args) {

        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(2);
        t11.setLeft(t12); t11.setRight(t13);

        int i = maxDepth(t11);

        System.out.println(i);
    }

    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());
        return max(left, right) + 1;
    }

    public static int max(int left,int right){
        if(left>=right){
            return left;
        }else {
            return right;
        }


    }

}
