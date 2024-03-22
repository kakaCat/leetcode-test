package leetcode491_500;


/**
 * @author admin
 * @date 2022/10/30
 * 498. 对角线遍历
 * @link(https://leetcode.cn/problems/diagonal-traverse/)
 */
public class $498 {

    public static void main(String[] args) {
       int[][]  mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        findDiagonalOrder(mat);
    }


    public static int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int index = 0 ;
        int dp[] = new int[row*col];
        for(int i = 0 ;i< row + col -1 ;i++){

            if(i%2==1){
                // i>row 过对角线了
                // 下降
                int x = i<row ? 0 : i-col+1;
                // 后退
                int y = i<row ? i : col -1 ;
                while(x<row && y>=0){
                    dp[index] = mat[x][y];
                    index++;
                    x++;
                    y--;
                }

            }else{
                // 上升
                int x = i < col ? i : row -1;
                // 前进
                int y = i < col ? 0 : i - row +1 ;
                while(x>=0 && y < col){
                    dp[index] = mat[x][y];
                    index++;
                    x--;
                    y++;
                }
            }

        }

        return dp;
    }

}
