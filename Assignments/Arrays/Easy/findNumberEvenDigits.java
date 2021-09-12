//leetcode problem 1295
class Solution {
    public int findNumbers(int[] nums) {
        int countTotal = 0;
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            int count = 0;
            while(value != 0){
                value = value / 10;
                count++;
            }
            if(count % 2 == 0){
                countTotal++;
            }
        }
        return countTotal;
    }
}
