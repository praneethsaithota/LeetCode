class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String doubled = s + s;
        int flipsStartWith0 = 0, flipsStartWith1 = 0, best = n;

        for (int i = 0; i < doubled.length(); i++) {
            char c = doubled.charAt(i);
            char expect0 = (i % 2 == 0) ? '0' : '1';
            char expect1 = (i % 2 == 0) ? '1' : '0';

            if (c != expect0) flipsStartWith0++;
            if (c != expect1) flipsStartWith1++;

            if (i >= n) {
                char left = doubled.charAt(i - n);
                char leftExpect0 = ((i - n) % 2 == 0) ? '0' : '1';
                char leftExpect1 = ((i - n) % 2 == 0) ? '1' : '0';
                if (left != leftExpect0) flipsStartWith0--;
                if (left != leftExpect1) flipsStartWith1--;
            }

            if (i >= n - 1) best = Math.min(best, Math.min(flipsStartWith0, flipsStartWith1));
        }
        return best;
    }
}
