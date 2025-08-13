class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] sol = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    sol[i][j] = 0;
                else if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    sol[i][j] = 1 + sol[i - 1][j - 1];
                else
                    sol[i][j] = Math.max(sol[i - 1][j], sol[i][j - 1]);
            }
        }
        return sol[m][n];
    }
}
