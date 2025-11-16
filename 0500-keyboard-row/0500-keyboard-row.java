class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        HashSet<Character> hs3 = new HashSet<>();
        ArrayList<String> ans= new ArrayList<>();
        hs1.add('q');
        hs1.add('w');
        hs1.add('e');
        hs1.add('r');
        hs1.add('t');
        hs1.add('y');
        hs1.add('u');
        hs1.add('i');
        hs1.add('o');
        hs1.add('p');
        hs2.add('a');
        hs2.add('s');
        hs2.add('d');
        hs2.add('f');
        hs2.add('g');
        hs2.add('h');
        hs2.add('j');
        hs2.add('k');
        hs2.add('l');
        hs3.add('z');
        hs3.add('x');
        hs3.add('c');
        hs3.add('v');
        hs3.add('b');
        hs3.add('n');
        hs3.add('m');
        int n = words.length;

        for(int i=0;i<n;i++){
            String w = words[i];
            if(w.length()==0) continue;
            String s = w.toLowerCase();
            int m = s.length();

            HashSet<Character> row = null;
            if(hs1.contains(s.charAt(0))) row = hs1;
            else if(hs2.contains(s.charAt(0))) row = hs2;
            else if(hs3.contains(s.charAt(0))) row = hs3;
            else continue;

            boolean ok = true;
            for(int j=1;j<m;j++){
                char ch = s.charAt(j);
                if(!row.contains(ch)){
                    ok = false;
                    break;
                }
            }
            if(ok) ans.add(words[i]);
        }

        return ans.toArray(new String[0]);
    }
}