package addresSsplit;

import java.util.ArrayList;
import java.util.List;

public class ParseAddress {


    public static void main(String[] args) {
        String text= "";
        String outText= "";
        parseAddress(text,outText);
    }

    private static void parseAddress(String text, String outText) {

       List<String> result = new ArrayList<>();// # 最终结果数组
       int working_index = -1 ;  ///# 正在处理的行index

        List<String>  input_lines = new ArrayList<>();
        for (String input_line : input_lines) {
            String working_line =  input_line;
            working_index += 1;
            if(input_line==""){
                continue;
            }

        }
    }


}
