package tree.tree;

import tree.base.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by JAVA on 2018/6/6.
 */
public class LevelOrder {


    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList();
        Queue<TreeNode> queue =new LinkedList();
        if(root==null){
            return result;
        }
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new LinkedList();
            for (int i = 0; i <size; i++) {
                TreeNode treeNode = queue.poll();
                levelList.add(treeNode.getVal());
                if(treeNode.getLeft()!=null){
                    queue.offer(treeNode.getLeft());
                }
                if(treeNode.getRight()!=null){
                    queue.offer(treeNode.getRight());
                }
            }
            result.add(levelList);

        }

        return result;
    }


}
