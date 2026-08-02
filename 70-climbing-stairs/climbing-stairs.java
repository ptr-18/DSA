class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }

    static int f(int ind, int[] dp) {
        if (ind == 0)
            return 1;

        if (ind < 0)
            return 0;

        if (dp[ind] != -1)
            return dp[ind];

        int left = f(ind - 1, dp);
        int right = f(ind - 2, dp);

        return dp[ind] = left + right;
    }
}