class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        f(0, nums, current, ans);

        return ans;
    }

    static void f(int ind, int[] nums, List<Integer> current, List<List<Integer>> ans) {

        if (ind == nums.length) {
            ans.add(new ArrayList<>(current)); // Store a copy
            return;
        }

        // Pick the current element
        current.add(nums[ind]);
        f(ind + 1, nums, current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // Don't pick the current element
        f(ind + 1, nums, current, ans);
    }
}