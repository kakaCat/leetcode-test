package leetcode331_340;

/**
 * @ClassName $331
 * @Description 验证二叉树的前序序列化
 * @Author yunp
 * @Date 2020/8/26 14:37
 * @Version 1.0
 **/
public class $331 {

    public static void main(String[] args) {

        String s = "9,3,4,#,#,1,#,#,2,#,6,#,#";


        boolean v = isValidSerialization(s);


        System.out.println(v);

    }

    public static boolean isValidSerialization(String preorder) {

        int slots  = 1;

        String[] split = preorder.split(",");

        for (String s : split) {
            --slots;

            if(slots<0){
                return false;
            }

            if(!s.equals("#")){
                slots += 2;
            }
        }

        return slots ==0;
    }



}
