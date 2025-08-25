import java.util.*;
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) Arrays.sort(row);
        int ans = 0;
        for (int j = grid[0].length - 1; j >= 0; j--) {
            int mx = 0;
            for (int[] row : grid) {
                mx = Math.max(mx, row[j]);
            }
            ans += mx;
        }
        return ans;
    }
}