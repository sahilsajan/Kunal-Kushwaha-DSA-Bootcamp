//leetcode question 1470
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int start = 0;
        for(int i = 0; i < n; i++){
            ans[start] = nums[i];
            ans[start + 1] = nums[n + i];
            start += 2;
        }
        return ans;
    }
}
