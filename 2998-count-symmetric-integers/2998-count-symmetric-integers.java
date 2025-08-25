class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) {
                int n = s.length() / 2, sum1 = 0, sum2 = 0;
                for (int j = 0; j < n; j++) sum1 += s.charAt(j) - '0';
                for (int j = n; j < s.length(); j++) sum2 += s.charAt(j) - '0';
                if (sum1 == sum2) ans++;
            }
        }
        return ans;
    }
}