package tree.tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JAVA on 2018/5/24.
 */
public class PreorderTraversal {


    List<Integer> nums = new ArrayList();

    public static void main(String[] args) {



    }
    public List<Integer> preorderTraversal(TreeNode root) {

        TreeNode current = root;

        if(current == null){
            return null;
        }

        nums.add(current.getVal());

        if(current.getRight()!=null){
            return preorderTraversal(current);
        }

        if(current.getLeft()!=null){
            return preorderTraversal(current);
        }

        return nums;
    }

}
