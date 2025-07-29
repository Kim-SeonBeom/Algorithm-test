class Solution {
    public double solution(int[] n) {
        double result = 0;
        for (int item : n){
            result += item; 
        }
        return result/n.length;
    }
}