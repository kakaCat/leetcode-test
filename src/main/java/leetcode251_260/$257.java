package leetcode251_260;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $257
 * @Description 257. 二叉树的所有路径
 * @Author yunp
 * @Date 2020/9/9 10:53
 * @Version 1.0
 **/
public class $257 {

    public static void main(String[] args) {

    }


    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();

        dfs(root, paths, "");
        return paths;
    }

    public static void dfs(TreeNode root, List<String> paths ,String path){

        if(root!=null){
            StringBuilder sb = new StringBuilder(path);
            sb.append(root.getVal());

            if(root.getLeft()==null && root.getRight()==null){
                paths.add(sb.toString());
            }else {
                sb.append("->");

                dfs(root.getLeft(), paths, sb.toString());
                dfs(root.getRight(), paths, sb.toString());
            }
        }

    }





}
