import java.util.*;

class Solution {
    public int solution(int n) {      
        int standardCnt = Integer.bitCount(n);
        while(true){
            n++;
            int cnt = Integer.bitCount(n);
            if(standardCnt==cnt){
               return n;
            }
        }
    }
}