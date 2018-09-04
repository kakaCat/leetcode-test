package array;

/**
 * Created by JAVA on 2018/8/28.
 */
public class 将一个字符串进行翻转 {


    public static void main(String[] args) {

        String sentence = "I love you";


        System.out.println(reversal2(sentence.toCharArray()));
    }

    public static String reversal1(char[] sentence){

        int length = 0;
        char[] newChar = new char[length = sentence.length];
        int j = 0;
        for (int i = length-1; i >=0; i--) {
            newChar[j++] = sentence[i];
        }
        return String.valueOf(newChar);
    }

    public static String reversal2(char[] sentence){

        int start=0;
        int end = sentence.length-1;

        char temp;
        while(start<=end){

            temp = sentence[end];

            sentence[end--] = sentence[start];

            sentence[start++] = temp;
        }

        return String.valueOf(sentence);
    }


}
