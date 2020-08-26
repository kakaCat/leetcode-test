package demo;

/**
 * @ClassName OperatorUtilsDome
 * @Description OperatorUtilsDome
 * @Author yunp
 * @Date 2020/7/21 9:28
 * @Version 1.0
 **/
public class OperatorUtilsDome {


    /**
     * @Author yunp
     * @Date 2020/7/21
     * @description
     *
     *   0000 0001  支持IM            1
     *   0000 0010  支持系统消息       2
     *   0000 0100  支持邮箱          4
     *   0000 1000  支持短信          8
     *
     *
     *
     *
     * @Param null
     * @Return
     */


    public static void main(String[] args) {


        long l = OperatorUtils.addMark(0L, 1L);


        Integer a = 0b01;
        int b = 0b01;

    }


}
