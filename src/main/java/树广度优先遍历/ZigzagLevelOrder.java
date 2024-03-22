package 树广度优先遍历;

import tree.base.TreeNode;

import java.util.*;

public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(Objects.isNull(root)){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        boolean sign = true;
        while(!queue.isEmpty()){
            final int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<size;i++){
                final TreeNode front = queue.poll();
                currentLevel.add(front.getVal());
                if(sign){
                    if(front.getLeft()!=null ){
                        queue.offer(front.getLeft());
                    }
                    if(front.getRight()!=null ){
                        queue.offer(front.getRight());
                    }
                }
                if(!sign){
                    if(front.getRight()!=null ){
                        queue.offer(front.getRight());
                    }
                    if(front.getLeft()!=null ){
                        queue.offer(front.getLeft());
                    }
                }
                res.add(currentLevel);
            }
            sign = !sign;
        }
        return res;
    }


}
