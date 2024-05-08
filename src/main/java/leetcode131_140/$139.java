package leetcode131_140;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class $139 {
    public static void main(String[] args) {
//        String s = "applepenapple";
//        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean canBreak = wordBreak(s, wordDict);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                final String word = s.substring(j, i);
                if (dp[j] && wordDictSet.contains(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
