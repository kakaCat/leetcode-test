package string;

public class 字符串中的第一个唯一字符 {

    public static void main(String[] args) {
       String s = "loveleetcode";
        int index = firstUniqChar(s);
        System.out.println("index->" + index);
    }

    public static int firstUniqChar(String s) {
        char[] temp=s.toCharArray();
        for(int i=0;i<temp.length;i++){
            int a=s.indexOf(temp[i]);
            int b=s.lastIndexOf(temp[i]);
            if(a==b){return i;}
        }
        return -1;


    }


}
