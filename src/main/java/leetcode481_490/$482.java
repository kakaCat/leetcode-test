package leetcode481_490;

/**
 * @ClassName $482
 * @Description 482. 密钥格式化
 * @Author yunp
 * @Date 2020/7/21 11:33
 * @Version 1.0
 **/
public class $482 {

    public static void main(String[] args) {


    }

    public static String licenseKeyFormatting(String S, int K) {

        String str = S.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int count =0;

        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)!='-'){
                sb.insert(0, str.charAt(i));
                count++;
                if(count%K==0){
                    sb.insert(0, str.charAt(i));
                }
            }

        }

        if(sb.length() > 0 && sb.charAt(0) == '-'){
            sb.delete(0,1);
        }
        return sb.toString();

    }

}
