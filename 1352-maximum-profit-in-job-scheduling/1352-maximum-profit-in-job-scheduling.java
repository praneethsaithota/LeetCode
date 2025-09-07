import java.util.*;

class Solution {
    static class job {
        int s, e, p;
        job(int s, int e, int p) {
            this.s = s;
            this.e = e;
            this.p = p;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        job[] jobs = new job[n];
        for (int i = 0; i < n; i++) jobs[i] = new job(startTime[i], endTime[i], profit[i]);
        Arrays.sort(jobs, (a, b) -> a.e - b.e);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 0);

        for (int i = 0; i < n; i++) {
            int c = jobs[i].p + map.floorEntry(jobs[i].s).getValue();
            if (c > map.lastEntry().getValue()) {
                map.put(jobs[i].e, c);
            }
        }
        return map.lastEntry().getValue();
    }
}
