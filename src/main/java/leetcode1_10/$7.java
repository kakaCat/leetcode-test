package leetcode1_10;

public class $7 {



    public int reverse(int x) {
        //一个队列
        int res =0;
        while(x!=0){
            //取最后一位
            int end = x % 10;
            int temp = res * 10 + end;
            //判读是否越界
            if (temp / 10 != res) {return 0;}
            res = temp;

            x = x/10;
        }
        return res;
    }
}
