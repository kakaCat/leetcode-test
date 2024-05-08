package leetcode101_110;

import leetcode221_230.$230;

public class $105 {

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
       int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};

        final TreeNode treeNode = buildTree2(preorder, inorder);

        System.out.println(treeNode);
    }


    public static TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;

        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        // 前序遍历序列的第一个元素是根节点的值
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        // 在中序遍历序列中找到根节点的索引
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        // 计算左子树的长度
        int leftSubtreeSize = rootIndex - inStart;

        int preStart1 = preStart + 1;
        int preEnd1 = preStart + leftSubtreeSize;
        int inStart1 = preStart + leftSubtreeSize + 1;
        int inEnd1 = rootIndex - 1;

        int preStart2 = preStart + leftSubtreeSize + 1;
        int preEnd2 = preEnd;
        int inStart2 = rootIndex + 1;
        int inEnd2 = inEnd;

        // 递归构造左子树和右子树
        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1);
        root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len1= preorder.length, len2=inorder.length;
        int[] arr = new int[len1+len2];
        int k =0,n=0,m=0;
        while(n<len1&&m<len2){
            if(preorder[n]<=inorder[m]){
                arr[k] = preorder[n];
                n++;
            }else{
                arr[k] = inorder[m];
                m++;
            }
            k++;
        }
        if(n!=len1-1){
            for(int i= n;n<len1;i++ ){
                arr[k] = preorder[i];
            }
        }
        if(m!=len2-1){
            for(int i= m;m<len2;i++ ){
                arr[k] = inorder[m];
            }
        }
        return dfs(arr,0,arr.length-1);
    }

    public TreeNode dfs(int[] arr,int l,int r){
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = dfs(arr,l,mid-1);
        root.right = dfs(arr,mid+1,r);
        return root;
    }


}
