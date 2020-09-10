package leetcode51_60;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $54
 * @Description 54. 螺旋矩阵
 * @Author yunp
 * @Date 2020/8/26 15:18
 * @Version 1.0
 **/
public class $54 {


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> integers = spiralOrder(matrix);


        System.out.println(integers);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> l = new ArrayList();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return l;
        }

        int rows =  matrix.length , columns = matrix[0].length;

        int left = 0 ,right = columns -1 , top = 0 ,bottom = rows -1;




        while(left <= right && top<=bottom){

            //从左到到右 到头
            for(int column = left ; column<= right; column ++){
                l.add(matrix[top][column]);
            }

            //从上 到下 到头
            for(int row = top+1 ;row<=bottom; row++){
                l.add(matrix[row][right]);
            }

            // 防止是一行
            if(left < right && top<bottom){
                //从右 未定行，到左 未定行
                for(int column = right -1  ; column > left; column --){
                    l.add(matrix[bottom][column]);
                }
                //从下 ，到上未定行
                for(int row = bottom  ; row > top; row --){

                    l.add(matrix[row][left]);
                }

            }
            left++;
            right--;
            top++;
            bottom--;

        }
        return  l;
    }
}
