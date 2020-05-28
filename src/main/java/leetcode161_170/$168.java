package leetcode161_170;

/**
 * @ClassName $168
 * @Description 168. Excel表列名称
 * @Author yunp
 * @Date 2020/5/28 10:40
 * @Version 1.0
 **/
public class $168 {

    public static void main(String[] args) {


        String s = convertToTitle(26);
        System.out.println(s);

    }


    public static String convertToTitle(int n) {


        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            if(c == 0){
                c = 26;
                n -= 1;
            }
            sb.insert(0, (char) ('A' + c - 1));
            n /= 26;
        }
        return sb.toString();
    }

}
