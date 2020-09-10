package leetcode51_60;

/**
 * @ClassName $59
 * @Description 59. 螺旋矩阵 II
 * @Author yunp
 * @Date 2020/9/1 15:11
 * @Version 1.0
 **/
public class $59 {

    public static void main(String[] args) {


        int[][] ints = generateMatrix(3);


        System.out.println(ints);
    }



    public static int[][] generateMatrix(int n) {

        int[][] result = new int[n ][n ];



        int left = 0, right = n-1,top = 0,botton = n-1;

        int vaule = 1;
        while(left<=right && top<=botton){

            for(int column = left; column  <=right;column++ ){
                result[top][column] = vaule;
                vaule++;
            }

            for(int row = top + 1; row  <=botton;row++ ){
                result[row][right] = vaule;
                vaule++;
            }


            if(left<right && top<botton){

                for(int column = right -1 ; column  >left;column-- ){
                    result[botton][column] = vaule;
                    vaule++;
                }

                for(int row = botton; row  > top;row-- ){
                    result[row][left] = vaule;
                    vaule++;
                }

            }
            left++;
            right--;
            top++;
            botton--;

        }


        return result ;

    }

}
