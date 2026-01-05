class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, List<Character>> map = new HashMap<>();
        for (String s : allowed) {
            String key = s.substring(0, 2);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s.charAt(2));
        }
        Set<String> memo = new HashSet<>();
        return dfs(bottom, map, memo, new StringBuilder());
    }

    private boolean dfs(String bottom, Map<String, List<Character>> map,
                        Set<String> memo, StringBuilder st) {
        if (bottom.length() == 1) return true;
        if (memo.contains(bottom)) return false;

        return buildNext(bottom, 0, map, memo, st);
    }

    private boolean buildNext(String bottom, int idx, Map<String, List<Character>> map,
                              Set<String> memo, StringBuilder st) {
        if (idx == bottom.length() - 1) {
            return dfs(st.toString(), map, memo, new StringBuilder());
        }

        String key = bottom.substring(idx, idx + 2);
        if (!map.containsKey(key)) return false;

        for (char c : map.get(key)) {
            st.append(c);
            if (buildNext(bottom, idx + 1, map, memo, st)) return true;
            st.deleteCharAt(st.length() - 1);
        }

        memo.add(bottom);
        return false;
    }
}
