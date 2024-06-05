package leetcode111_120;

import java.util.ArrayList;
import java.util.List;

public class $113 {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        String s ="";
        s.substring(1);
        backtract(root.left,targetSum,new ArrayList());
        return ans;

    }
    public void backtract(TreeNode root,int targetSum,List<Integer> used){
        if(root == null){
            return;
        }

        if(root.left==null&&root.right==null&&root.val == targetSum){
            used.add(root.val);
            ans.add(new ArrayList(used));
            return;
        }
        int val = root.val;
        used.add(val);
        backtract(root.left,targetSum-val,used);

        backtract(root.right,targetSum-val,used);
        used.remove(used.size()-1);

    }
}
