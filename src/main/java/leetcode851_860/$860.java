package leetcode851_860;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $860
 * @Description 860. 柠檬水找零
 * @Author yunp
 * @Date 2020/7/20 17:51
 * @Version 1.0
 **/
public class $860 {


    public static void main(String[] args) {

    }


    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                five--;
                ten++;
            }else{
                if(ten > 0){//优先使用
                    ten--;
                    five--;
                }else{
                    five -= 3;
                }

            }
            if(five < 0) return false;
        }
        return true;


    }





}
