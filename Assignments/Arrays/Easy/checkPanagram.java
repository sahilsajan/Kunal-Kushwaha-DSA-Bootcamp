//leetcode question 1832
//not optimized soln for beginners (no sets)
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] check = new int[123];
        for(int i = 0; i < sentence.length(); i++){
            char curr = sentence.charAt(i);
            check[curr]++;
        }
        boolean ans = true;
        for(int i = 97; i < 123; i++){
            if(check[i] == 0){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
