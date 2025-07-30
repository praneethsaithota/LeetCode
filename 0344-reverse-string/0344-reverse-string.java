public class Solution {
    public void reverseString(char[] characters) {
        int i = 0;
        int j = characters.length - 1;

        while (i < j) {
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;

            i++;
            j--;
        }
    }
}
