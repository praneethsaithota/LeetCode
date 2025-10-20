public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int da = 0;
            int db = 0;
            if (i >= 0) {
                da = a.charAt(i) - '0';
            }
            if (j >= 0) {
                db = b.charAt(j) - '0';
            }
            int sum = da + db + carry;
            sb.append((char)('0' + (sum % 2)));
            carry = sum / 2;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
