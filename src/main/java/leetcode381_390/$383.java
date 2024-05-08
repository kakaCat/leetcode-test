package leetcode381_390;

import java.util.HashMap;
import java.util.Map;

public class $383 {

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
//        magazine.equals equals
        boolean result = canConstruct(ransomNote, magazine);
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
//        magazineMap.ke
        // 构建杂志字符串中每个字符的出现次数的哈希表
        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        // 遍历赎金信字符串，逐个减少哈希表中对应字符的出现次数
        for (char ch : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) <= 0) {
                return false;
            }
            magazineMap.put(ch, magazineMap.get(ch) - 1);
        }

        return true;
    }
}
