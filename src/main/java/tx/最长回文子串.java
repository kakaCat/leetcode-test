package tx;

public class 最长回文子串 {

    public static void main(String[] args) {

        String s = "ccc";
        System.out.println(longestPalindrome1(s));

    }
    //暴力

    public static String longestPalindrome2(String s) {

        int len = s.length();
        int offset = 0;
        int start = 0;

        for(int i = 0; i< len  ;i++){
            int l = i-1;
            int r = i+1;
            while(l>0 && r < len && s.charAt(l)==s.charAt(r)){
                if (r - l + 1 > offset) {
                    start = l;
                    offset = r - l + 1;
                }
                l--;
                r++;
            }

        }

        for(int i = 0 ; i < len ;i++){
            int l = i;
            int r = i+1;

            while(l>0 && r < len && s.charAt(l)==s.charAt(r)){
                if (r - l + 1 > offset) {
                    start = l;
                    offset = r - l + 1;
                }
                l--;
                r++;
            }

        }

        if(offset>0){
            return s.substring(start,  start +offset);
        }


        return null;
    }

    //暴力
    public static String longestPalindrome1(String s) {

        int len = s.length();
        int offset = 0;
        int l = 0;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                int index1 = 0;
                int index2 = 0;

                for(index1 = i,index2 = j ; index1<index2 ; index1++,index2--){

                    if(arr[index1]!=arr[index2]){
                        break;
                    }

                }

                if (index1 >= index2 && j - i > offset) {

                    offset = j - i + 1;
                    l = i;

                }


            }

        }

        if (offset > 0) {
            return s.substring(l, l + offset);
        }


        return null;
    }

}
