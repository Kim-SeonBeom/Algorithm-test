class Solution {
    public int solution(String t, String p) {
        long pInt = Long.parseLong(p);
        int pLength = p.length();
        int cnt = 0;
        for (int i = 0; i < t.length()-pLength+1; i++) {
            long piece = Long.parseLong(t.substring(i,i+pLength));
            System.out.println(piece);
            if(piece<=pInt) cnt++;
        }
    return cnt;
    }
}