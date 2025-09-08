class Solution {
    int[] dp;

    int mps(int N) {
        if (N == 0) return 0;
        if (dp[N] != -1) return dp[N];

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            ans = Math.min(ans, mps(N - i * i));
        }

        dp[N] = ans + 1;
        return dp[N];
    }

    public int numSquares(int N) {
        dp = new int[N + 1];
        for (int i = 0; i <= N; i++) dp[i] = -1;
        return mps(N);
    }
}
