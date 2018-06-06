package junior;

/**
 * Created by JAVA on 2018/5/29.
 */
public class 计数质数 {

    public static void main(String[] args) {
      int count =  countPrimes(10);


        System.out.println("11");
    }


    public static int countPrimes(int n) {
        //创建一个记录
        boolean isPrime[]=new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }

        //找出所以的非质数
        for(int i=2;i*i<=n;i++){
            //已经被排查
            if(isPrime[i]==false){
                continue;
            }

            for(int j=2;j*i<n;j++){
                //生成的数均不为质数
                isPrime[i*j]=false;
            }
        }

        int ans=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]==true){
                ans++;
            }
        }
        return ans;
    }

}
