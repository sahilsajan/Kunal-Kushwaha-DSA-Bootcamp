//leetcode question 1389
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
