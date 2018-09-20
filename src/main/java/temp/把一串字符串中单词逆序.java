package temp;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by JAVA on 2018/8/28.
 */
public class 把一串字符串中单词逆序 {

    public static void main(String[] args) {

        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap();
        map.put(null, null);



        String sentence = "I love you";

        System.out.println(ReverseSentence(sentence.toCharArray()));

    }


    public static String ReverseSentence(char[] sentence){




        int start =0 ;
        int end = 0;
        //
        for (int i = 0; i < sentence.length; i++) {

            if(' '==sentence[i]){
                reversal(sentence,start,end);
                start = i + 1;
            }
            end++;

        }
        //逆转最后一个词
        reversal(sentence,start,end);
        //逆转整个句子
        reversal(sentence,0,sentence.length);
        return String.valueOf(sentence);
    }



    public static char[] reversal(char[] sentence,int start ,int end){

//        int start=0;
//        int end = sentence.length-1;

        --end;
        char temp;
        while(start<end){

            temp = sentence[end];

            sentence[end--] = sentence[start];

            sentence[start++] = temp;
        }

        return sentence;
    }

}
