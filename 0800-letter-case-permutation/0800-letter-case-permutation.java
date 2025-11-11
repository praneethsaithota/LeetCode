import java.util.*;

class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        backtrack(s.toCharArray(), 0);
        return ans;
    }

    void backtrack(char[] s, int i) {
        if (i == s.length) {
            ans.add(new String(s));
            return;
        }
        if (Character.isLetter(s[i])) {
            
            s[i] = Character.toLowerCase(s[i]);
            backtrack(s, i + 1);
            
            s[i] = Character.toUpperCase(s[i]);
            backtrack(s, i + 1);
        } else {
            backtrack(s, i + 1);
        }
    }
}
