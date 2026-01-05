class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, List<Character>> map = new HashMap<>();
        for (String s : allowed) {
            String key = s.substring(0, 2);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s.charAt(2));
        }
        Set<String> memo = new HashSet<>();
        return dfs(bottom, map, memo);
    }

    private boolean dfs(String bottom, Map<String, List<Character>> map, Set<String> memo) {
        if (bottom.length() == 1) return true;
        if (memo.contains(bottom)) return false;

        List<String> nextRows = new ArrayList<>();
        buildNext(bottom, 0, new StringBuilder(), map, nextRows);

        for (String next : nextRows) {
            if (dfs(next, map, memo)) return true;
        }

        memo.add(bottom);
        return false;
    }

    private void buildNext(String bottom, int idx, StringBuilder st,
                           Map<String, List<Character>> map, List<String> nextRows) {
        if (idx == bottom.length() - 1) {
            nextRows.add(st.toString());
            return;
        }

        String key = bottom.substring(idx, idx + 2);
        if (!map.containsKey(key)) return;

        for (char c : map.get(key)) {
            st.append(c);
            buildNext(bottom, idx + 1, st, map, nextRows);
            st.deleteCharAt(st.length() - 1);
        }
    }
}