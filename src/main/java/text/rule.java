package text;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rule {

    public static void main(String[] args) {

        System.out.println(getTry());



    }


    private static String getTry(){
        String aa = "11";

        try{
            return aa;
        }finally {
            aa = "22";
        }
    }

}
