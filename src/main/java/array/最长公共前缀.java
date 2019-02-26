package array;

public class 最长公共前缀 {

    public static void main(String[] args) {
        String[] str = {"c","c"};
        String s = longestCommonPrefix(str);
        System.out.println(s);
    }


    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }

        String reselt = "";
        for(int i = 0;i<strs[0].length()-1;i++){
            for(int j = 1;j<strs.length;j++){
                String str = strs[j];
                if(str.length()==0||str.length()-1<i){
                    return reselt;
                }else {
                    if(strs[0].charAt(i)!=str.charAt(i)){
                        return reselt;
                    }
                }
            }
            reselt += strs[0].charAt(i);

        }

        return reselt;
    }

}
