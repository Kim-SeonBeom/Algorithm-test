import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        // System.out.println(Arrays.toString(d));
        int cnt = 0 ;
        for(int i = 0; i<d.length; i++){
            budget = budget-d[i];
            cnt++;
            System.out.println(budget);
            // System.out.println(cnt);
            if(budget<0){
                cnt--;
                break;
            }
        }
       
        return cnt;
    }
}