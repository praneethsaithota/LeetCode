class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        
        char target = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                target = c;
                break;
            }
        }
        String a = target == ' ' ? s : s.replace(target, '9');
        
        target = s.charAt(0) == '1' ? ' ' : s.charAt(0);
        String b;
        if (target != ' ') {
            b = s.replace(target, '1');
        } else {
            target = ' ';
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                    target = s.charAt(i);
                    break;
                }
            }
            b = target == ' ' ? s : s.replace(target, '0');
        }
        
        return Integer.parseInt(a) - Integer.parseInt(b);
    }
}
