import java.util.Arrays;
class Solution {
    public String solution(String X, String Y) {
        String result = "";
        int[] xNum = new int[10];
        int[] yNum = new int[10];
        int[] reNum = new int[10];
        for (int i = 0; i < X.length(); i++) {
            xNum[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            yNum[Y.charAt(i) - '0']++;
        }
        System.out.println(Arrays.toString(xNum));
        System.out.println(Arrays.toString(yNum));

        for (int i = 0; i < reNum.length; i++) {
            reNum[i] = Math.min(xNum[i], yNum[i]);
        }
        System.out.println(Arrays.toString(reNum));
        StringBuilder sb = new StringBuilder();
        for (int i = reNum.length - 1; i > 0; i--) {
            if (reNum[i] > 0) {
                String s = String.valueOf(i);
                sb.append(s.repeat(reNum[i]));
            }
        }
        if(reNum[0]>0&&sb.length()==0){
            sb.append(0);
        }else if(reNum[0]>0) {
            sb.append("0".repeat(reNum[0]));
        }else if (sb.length() == 0) {
            sb.append(-1);
        }
        result = sb.toString();
        return result;
    }
}