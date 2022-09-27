

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] s_split = s.toCharArray();
        int wordIdx = 0;
        for(int i = 0; i < s_split.length; i++){
            wordIdx = (s_split[i] == ' ') ? 0 : wordIdx+1;
            
            if(wordIdx %2 != 0 ){
                s_split[i] = (char)(s_split[i]-32);
            
            }
        }
      
        return new String(s_split);
    }
}