package array;

public class 翻转字符串里的单词 {

    public static void main(String[] args) {
        String str = "   a   b ";
        String s = reverseWords(str);
        System.out.println(s);
    }


    public static String reverseWords(String s) {
        if(s.length()==1){
            return s;
        }

        String result = "";
        String temp ="";
        char[] chars = s.toCharArray();
        for(int i =chars.length-1;i>=0;i-- ){


            if(chars[i]==' '){
                result =result + temp ;
                temp ="";
                continue;
            }
            temp = chars[i] +temp;
            if(i == 0){
                result =result + temp ;
            }

        }

        return result.trim();
    }

}
