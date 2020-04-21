package recursion;

/**
 * @ClassName 斐波那契数
 * @Description TODO
 * @Author yunp
 * @Date 2019/12/30 10:20
 * @Version 1.0
 **/
public class 斐波那契数 {

    public int fib(int N) {

        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }

        return fib(N - 1) + fib(N - 2);
    }



}
