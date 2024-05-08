package leetcode191_200;

import leetcode101_110.$105;

import java.util.ArrayList;
import java.util.List;

public class $199 {
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

        // 构造二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        rightSideView(root);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        dfs(root,0,list);
        List<Integer> ans = new ArrayList();
        for(int i =0;i<list.size();i++ ){
            List<Integer> l = list.get(i);
            if(l!=null&&l.size()!=0){
                ans.add(l.get(l.size()-1));
            }

        }
        return ans;
    }
    public static void dfs(TreeNode root,Integer level,List<List<Integer>> list){
        if(root == null){
            return;
        }
        if(level==list.size()){
            list.add(new ArrayList());
        }
        list.get(0).add(root.val);
        dfs(root.left,level+1,list);
        dfs(root.right,level+1,list);
    }
}
