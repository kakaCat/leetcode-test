package leetcode401_410;

import tree.base.TreeNode;

/**
 * @ClassName $404
 * @Description 404. 左叶子之和
 * @Author yunp
 * @Date 2020/4/23 17:03
 * @Version 1.0
 **/
public class $404 {

    public static void main(String[] args) {
        TreeNode t11 = new TreeNode(3);
        TreeNode t12 = new TreeNode(9);
        TreeNode t13 = new TreeNode(20);
        TreeNode t14 = new TreeNode(15);
        t13.setLeft(t14);
        t11.setLeft(t12); t11.setRight(t13);
        int i = sumOfLeftLeaves(t11);

        System.out.println(i);
    }


    public static int sumOfLeftLeaves(TreeNode root) {

        if(root==null){
            return 0;
        }
        int sum = 0;

        if(root.getLeft()==null&&root.getRight()==null){
            sum = root.getVal();
        }else {
            sum += sumOfLeftLeaves(root.getLeft());
        }
        if(root.getRight()!=null){
            sum  += sumOfLeftLeaves(root.getRight());
        }

        return sum;
    }


}
