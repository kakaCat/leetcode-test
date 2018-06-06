package junior;

/**
 * Created by JAVA on 2018/5/31.
 */
public class 旋转图像 {

    public static void main(String[] args) {

        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {

        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        //行
        for(int i=0;i<rowLength;i++){
            //列
            for(int j=i+1;j<columnLength;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        //行
        for(int i=0;i<rowLength;i++){
            //列
            for(int j=0;j<columnLength/2;j++){

                int temp = matrix[i][j];

                matrix[i][j] = matrix[i][columnLength-1-j];
                matrix[i][columnLength-1-j] =temp;
            }
        }



    }


}



