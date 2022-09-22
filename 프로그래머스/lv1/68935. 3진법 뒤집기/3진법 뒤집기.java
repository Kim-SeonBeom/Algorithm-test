class Solution {
    public int solution(int n) {
    
        StringBuilder sb = new StringBuilder();
        String threeN = "";
        while(n>0){
            threeN = (n%3)+threeN;
            n/=3;
        }
        sb.append(threeN).reverse();
        String rev_threeN = sb.toString();
        int rev_N = Integer.parseInt(rev_threeN,3);
        return rev_N;
    }
}