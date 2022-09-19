class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                if(65<=s.charAt(i)&&s.charAt(i)<=90) {
                    if(s.charAt(i)+n>90) {
                        sb.append((char)(s.charAt(i)+n-26));
                    }else sb.append((char)(s.charAt(i)+n));
                }else if(97<=s.charAt(i)&&s.charAt(i)<=122){
                    if(s.charAt(i)+n>122) {
                        sb.append((char)(s.charAt(i)+n-26));
                    }else sb.append((char)(s.charAt(i)+n));
                }
            }else sb.append(s.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}