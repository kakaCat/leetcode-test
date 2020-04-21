package leetcode111_120;

import tree.base.TreeNode;

/**
 * @ClassName $111
 * @Description 111. 二叉树的最小深度
 * @Author yunp
 * @Date 2020/4/21 17:51
 * @Version 1.0
 **/
public class $111 {

    public static void main(String[] args) {
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(2);
        t11.setLeft(t12); t11.setRight(t13);

        int i = minDepth(t11);

        System.out.println(i);
    }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.getLeft()==null&&root.getRight()==null){
            return 1;
        }

        int depth_len = Integer.MAX_VALUE;
        if(root.getLeft()!=null){
            depth_len = min(minDepth(root.getLeft()), depth_len);
        }

        if(root.getRight()!=null){
            depth_len = min(minDepth(root.getRight()), depth_len);
        }
        return depth_len+1;
    }

    public static int min(int left,int right){
        if(left<right){
            return left;
        }else {
            return right;
        }
    }

}
