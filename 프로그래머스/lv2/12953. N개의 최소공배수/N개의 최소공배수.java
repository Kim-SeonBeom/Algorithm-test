class Solution {
    public int solution(int[] arr) {
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = lcm(x, arr[i]);
        }
        return x;
    }
    
    public static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    public static int lcm(int a,int b){
        return (a*b) / gcd(a,b);
    }
    
    
}