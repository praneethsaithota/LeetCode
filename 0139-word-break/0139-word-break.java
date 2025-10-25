import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return canBreak(s, 0, wordSet, memo);
    }

    private boolean canBreak(String s, int start, Set<String> wordSet, Boolean[] memo) {
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordSet.contains(s.substring(start, end)) && canBreak(s, end, wordSet, memo)) {
                memo[start] = true;
                return true;
            }
        }

        memo[start] = false;
        return false;
    }
}
