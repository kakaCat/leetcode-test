package string;

public class 最长公共前缀 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

    }

    public String longestCommonPrefix(String[] strs) {
        int minLongth =0;
        for (int i = 0; i < strs.length; i++) {
            int length = strs[i].length();
            if(minLongth==0||minLongth>length){
                minLongth = length;
            }
        }
        String result = "";
        for(int i=0;i<minLongth;i++){
            String temp ="";
            for (int j = 0; j < strs.length; j++) {

            }
        }





    }

}
