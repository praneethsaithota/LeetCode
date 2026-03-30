class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] e = new int[26], o = new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                e[s1.charAt(i)-'a']++;
                e[s2.charAt(i)-'a']--;
            } else {
                o[s1.charAt(i)-'a']++;
                o[s2.charAt(i)-'a']--;
            }
        }
        for(int x:e) if(x!=0) return false;
        for(int x:o) if(x!=0) return false;
        return true;
    }
}