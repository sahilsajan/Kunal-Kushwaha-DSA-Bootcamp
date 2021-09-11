//leetcode question 1365
//brute force method since sorting hasnt been taught yet
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
