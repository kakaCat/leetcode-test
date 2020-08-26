package demo;

/**
 * @ClassName Utils
 * @Description 占位符
 * @Author yunp
 * @Date 2020/7/21 9:23
 * @Version 1.0
 **/
public class OperatorUtils {


    private OperatorUtils(){}



    /**
     * @Author yunp
     * @Date 2020/7/21
     * @description 用户当前值
     * @Param null
     * @Return
     */
    public static boolean hasMark(Long mod,Long value){
        return (mod&value) == value;
    }


    /**
     * @Author yunp
     * @Date 2020/7/21
     * @description //todo
     * @Param null
     * @Return 
     */
    public static long addMark(Long mod,Long value){

        if(hasMark(mod,value)){
            return mod;
        }
        return (mod|value);
    }

    public static long removeMark(Long mod,Long value){

        if(!hasMark(mod,value)){
            return mod;
        }
        return (mod^value);
    }


}
