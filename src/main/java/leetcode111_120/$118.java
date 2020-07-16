package leetcode111_120;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $118
 * @Description 118. 杨辉三角
 * @Author yunp
 * @Date 2020/7/9 15:22
 * @Version 1.0
 **/
public class $118 {


    public static void main(String[] args) {


        generate2(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        if(numRows == 0){
            return dp;
        }
        dp.add(new ArrayList<>());
        dp.get(0).add(1);
        //注意这里的 i 是指行数，但是dp是从0开始的
        //所以preRow是i-2
        for(int i = 2;i <= numRows;i++){
            List<Integer> row = new ArrayList<>();
            //获取上层数据
            List<Integer> preRow = dp.get(i-2);
            row.add(1);
            for(int j = 1;j < i-1;j++){

                row.add(preRow.get(j) + preRow.get(j-1));
            }
            row.add(1);
            dp.add(row);
        }
        return dp;
    }

    public static List<List<Integer>> generate2(int numRows) {


        List<List<Integer>> dp = new ArrayList<>();
        if(numRows==0){
            return dp;
        }
        List<Integer> init = new ArrayList<>();
        init.add(1);
        dp.add(init);
        for(int i=2;i<=numRows;i++){
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> upRow = dp.get(i-2);

            currentRow.add(1);

            for(int j =1;j<i-1;j++){
                currentRow.add(upRow.get(j - 1) + upRow.get(j));
            }

            currentRow.add(1);

            dp.add(currentRow);
        }


        return dp;




    }
    public int game(int[] guess, int[] answer) {
        int sum =0;
        for(int i =0;i< guess.length; i++){

            if(guess[i]==answer[i]){
                sum++;
            }

        }
        return sum ;
    }


    public int minCount(int[] coins) {

        int cnt = 0;

        for(int i=0;i<coins.length;i++){

            cnt = cnt + coins[i] / 2 + coins[i] % 2;

        }

        return cnt;
    }



}
