package leetcode91_100;

import tree.base.TreeNode;

/**
 * @ClassName $100
 * @Description 100. 相同的树
 * @Author yunp
 * @Date 2020/4/21 15:54
 * @Version 1.0
 **/
public class $100 {

    public static void main(String[] args) {
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(2);
        TreeNode t13 = new TreeNode(3);
        t11.setLeft(t12); t11.setRight(t13);

        TreeNode t21 = new TreeNode(1);
        TreeNode t22 = new TreeNode(2);
        TreeNode t23 = new TreeNode(3);
        t21.setLeft(t22); t21.setRight(t23);
        boolean sameTree = isSameTree(t11, t21);

        System.out.println(sameTree);
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }

        if(p==null||q==null){
            return false;
        }
        if(p.getVal()!=q.getVal()){
            return false;
        }

        return isSameTree(p.getRight(),q.getRight())&&
                isSameTree(p.getLeft(),q.getLeft()) ;
    }


}
