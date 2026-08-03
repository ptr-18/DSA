class Solution {

    int[][] dp;
    int INF = (int) 1e9;

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(n - 1, amount, coins);

        return ans >= INF ? -1 : ans;
    }

    int solve(int ind, int target, int[] coins) {

        if (ind == 0) {
            if (target % coins[0] == 0)
                return target / coins[0];

            return INF;
        }

        if (dp[ind][target] != -1)
            return dp[ind][target];

        int notTake = solve(ind - 1, target, coins);

        int take = INF;

        if (coins[ind] <= target)
            take = 1 + solve(ind, target - coins[ind], coins);

        return dp[ind][target] = Math.min(take, notTake);
    }
}