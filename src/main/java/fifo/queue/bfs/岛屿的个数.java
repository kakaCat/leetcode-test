package fifo.queue.bfs;

public class 岛屿的个数 {


    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        int i = numIslands(grid);
        System.out.println(i);
    }

    public static int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length ==0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(grid[i][j]);
                if(grid[i][j]=='1'){
                    res++;
                    toZero(grid,i,j,rows,cols);
                }
            }
        }
        return res;
    }
    private static void toZero(char[][] grid,int i,int j,int rows,int cols){
        if(i<0 || i>=rows || j<0 || j>=cols){
            return ;
        }


        if(grid[i][j]!='1'){
            return;
        }
        /** 相邻的1，都至为0 */
        grid[i][j]='0';
        toZero(grid,i+1,j,rows,cols);
        toZero(grid,i-1,j,rows,cols);
        toZero(grid,i,j+1,rows,cols);
        toZero(grid,i,j-1,rows,cols);
    }
}



