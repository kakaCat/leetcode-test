//package leetcode1l10;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class $6 {
//
//    public static void main(String[] args) {
//        String leetcodeishiring = convert("LEETCODEISHIRING", 3);
//        System.out.println(leetcodeishiring);
//    }
//
//    public static String convert2(String s, int numRows) {
//
//        if (numRows == 1) {
//            return s;
//        }
//
//        List<StringBuilder> rows = new ArrayList<>();
//        for (int i = 0; i < Math.min(numRows, s.length()); i++){
//            rows.add(new StringBuilder());
//        }
//
//        int len = numRows + (numRows - 2);
//
//
//        return ret.toString();
//    }
//
//    public static String convert(String s, int numRows) {
//
//        if (numRows == 1) {
//            return s;
//        }
//
//        List<StringBuilder> rows = new ArrayList<>();
//        for (int i = 0; i < Math.min(numRows, s.length()); i++){
//            rows.add(new StringBuilder());
//        }
//
//        int curRow = 0;
//        boolean goingDown = false;
//
//        for (char c : s.toCharArray()) {
//            rows.get(curRow).append(c);
//            if (curRow == 0 || curRow == numRows - 1){
//                goingDown = !goingDown;
//            }
//            curRow += goingDown ? 1 : -1;
//        }
//
//        StringBuilder ret = new StringBuilder();
//        for (StringBuilder row : rows){
//            ret.append(row);
//        }
//        return ret.toString();
//    }
//
//}
