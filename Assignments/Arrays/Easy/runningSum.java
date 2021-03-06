//leetcode question 1480
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
