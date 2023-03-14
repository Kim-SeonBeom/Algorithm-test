class Solution {
    public String solution(String s) {
 
        s = s.toLowerCase();
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length-1; i++) {
            if(sArr[i].equals("")){sb.append(" ");continue;}
            sArr[i] = sArr[i].substring(0,1).toUpperCase() + sArr[i].substring(1);
            sb.append(sArr[i]);
            sb.append(" ");
        }
        sArr[sArr.length - 1] = sArr[sArr.length - 1].substring(0, 1).toUpperCase() + sArr[sArr.length - 1].substring(1);
        sb.append(sArr[sArr.length - 1]);
        int idx = 0;
        if(s.substring(s.length()-1).equals(" ")){
            for (int i = s.length()-1; i >= 0 ; i--) {
                if (s.substring(i,i+1).equals(" ")){
                    idx = i;
                }else break;
            }
            for (int i = 0; i < s.length()-idx; i++) {
            sb.append(" ");
            }
        }
       
        String result = sb.toString();

        
        return result;
    }
}