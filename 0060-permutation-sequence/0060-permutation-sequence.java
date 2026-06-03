class Solution {
    public String getPermutation(int n, int k) {
        int[] fact = new int[10];
        fact[0] = 1;

        for (int i = 1; i <= 9; i++) {
            fact[i] = i * fact[i - 1];
        }

        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = i;
        }

        StringBuilder ans = new StringBuilder();
        helper(1, n, k, fact, nums, ans);

        return ans.toString();
    }

    void helper(int pc, int n, int k,
                int[] fact, int[] nums, StringBuilder ans) {

        if (pc > n) return;

        if (k == 1) {
            for (int i = pc; i <= n; i++) {
                ans.append(nums[i]);
            }
            return;
        }

        int block = fact[n - pc];
        int skipped = 0;

        for (int i = pc; i <= n; i++) {

            if (skipped + block < k) {
                skipped += block;
                continue;
            }

            ans.append(nums[i]);

            moveToFront(nums, pc, i);

            helper(pc + 1, n, k - skipped, fact, nums, ans);
            return;
        }
    }

    void moveToFront(int[] nums, int pc, int i) {
        int temp = nums[i];

        for (int j = i; j > pc; j--) {
            nums[j] = nums[j - 1];
        }

        nums[pc] = temp;
    }
}