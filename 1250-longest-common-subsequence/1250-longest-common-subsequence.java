class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] sol = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i <= text1.length(); i++) {
            for (int j = 0; j <= text2.length(); j++) {
                if (i == 0 || j == 0)
                    sol[i][j] = 0;
                else if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    sol[i][j] = 1 + sol[i - 1][j - 1];
                else
                    sol[i][j] = Math.max(sol[i - 1][j], sol[i][j - 1]);
            }
        }
        return sol[text1.length()][text2.length()];
    }
}
