class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int crrmax=nums[0];
        for(int i=1 ; i<nums.length;i++){
            crrmax=Math.max(nums[i],crrmax+nums[i]);
            max=Math.max(max,crrmax);
        }
        return max;
    }
}