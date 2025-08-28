class Solution {
    public boolean isPalindrome(int i) {
        if (i < 0 || (i % 10 == 0 && i != 0)) return false;

        int j = 0;
        int k = i;

        while (i > 0) {
            int d = i % 10;
            j = j * 10 + d;
            i = i / 10;
        }

        return j == k;
    }
}
