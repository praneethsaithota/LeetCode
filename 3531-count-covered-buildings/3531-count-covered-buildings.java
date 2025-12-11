class Solution {
    class Pair {
        int a, b;
        Pair(int a, int b){ this.a = a; this.b = b; }
    }

    public int countCoveredBuildings(int n, int[][] buildings) {

        // row wise leftmost & rightmost
        Pair[] rowLR = new Pair[n+1];
        for (int i = 1; i <= n; i++) rowLR[i] = new Pair(-1, -1);

        // column wise top & bottom
        Pair[] colTB = new Pair[n+1];
        for (int j = 1; j <= n; j++) colTB[j] = new Pair(-1, -1);

        // store buildings for quick lookup
        HashSet<Long> set = new HashSet<>();

        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            long key = ((long)x << 32) | y;
            set.add(key);

            // update row left/right
            if (rowLR[x].a == -1 || y < rowLR[x].a) rowLR[x].a = y;
            if (rowLR[x].b == -1 || y > rowLR[x].b) rowLR[x].b = y;

            // update column top/bottom
            if (colTB[y].a == -1 || x < colTB[y].a) colTB[y].a = x;
            if (colTB[y].b == -1 || x > colTB[y].b) colTB[y].b = x;
        }

        int c = 0;

        // check covered buildings
        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            int top = colTB[y].a;
            int bot = colTB[y].b;

            // must have at least 2 buildings in this column
            if (top == -1 || bot == -1 || top == bot) continue;

            // must be strictly between
            if (x <= top || x >= bot) continue;

            Pair p = rowLR[x];

            if (p.a < y && y < p.b) c++;
        }

        return c;
    }
}
