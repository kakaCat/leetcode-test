package 树广度优先遍历;

import tree.base.TreeNode;

import java.util.*;

public class LevelOrder {


    public static void main(String[] args) {

    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        for (List<Integer> re : res) {
            
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){


            int currentSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<currentSize;i++){
                TreeNode front =queue.poll();
                currentLevel.add(front.getVal());

                if(front.getLeft()!=null){
                    queue.offer(front.getLeft());
                }
                if(front.getRight()!=null){
                    queue.offer(front.getRight());
                }

            }
            res.add(currentLevel);
        }
        return res;
    }
}
