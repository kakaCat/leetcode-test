package leetcode111_120;

import tree.base.TreeNode;

/**
 * @ClassName $112
 * @Description 112. 路径总和
 * @Author yunp
 * @Date 2020/4/28 16:23
 * @Version 1.0
 **/
public class $112 {

    public static void main(String[] args) {
        TreeNode t11 = new TreeNode(5);

        TreeNode l11 = new TreeNode(4);
        TreeNode r12 = new TreeNode(8);
        t11.setLeft(l11);t11.setRight(r12);
        TreeNode l21 = new TreeNode(11);
        l11.setLeft(l21);
        TreeNode l31 = new TreeNode(7);
        TreeNode r32 = new TreeNode(2);
        l21.setLeft(l31);l21.setRight(r32);

        boolean b = hasPathSum(t11,22);


        System.out.println(b);
    }


    public static boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }
        sum -= root.getVal();

        if(root.getLeft() ==null&&root.getRight()==null){
            return sum==0;
        }


        return hasPathSum(root.getLeft(),sum)||hasPathSum(root.getRight(),sum);
    }


}
