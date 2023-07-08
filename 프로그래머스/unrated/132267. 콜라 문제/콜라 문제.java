class Solution {
    public int result = 0;
    public int r;
    
    public int solution(int a, int b, int n) {
        exchange(a, b, n);
        return result;
    }
     public int exchange(int a, int b, int n) {
        if (n < a) return 0;
        result += (n / a) * b;
        r = ((n / a) * b) + (n % a);
        return exchange(a, b, r);
    }
}