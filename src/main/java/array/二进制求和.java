package array;

public class 二进制求和 {

    public static void main(String[] args) {

        String s = addBinary("11","1");
        System.out.println(s);

    }


    public static String addBinary(String a, String b) {
        char[] aChars = a.toCharArray(), bChars = b.toCharArray();
        int alen = aChars.length-1,blen=bChars.length-1,carry=0;
        String result = "";
        while (alen>=0||blen>=0){
            int aVaule = alen>=0 ? aChars[alen--]-'0':0;
            int bVaule = blen>=0 ? bChars[blen--]-'0':0;
            int sum = aVaule + bVaule + carry;
            result = String.valueOf(sum % 2) + result;
            carry = sum/2;
        }
        return carry == 1 ?  "1" + result  :result;
    }
}
