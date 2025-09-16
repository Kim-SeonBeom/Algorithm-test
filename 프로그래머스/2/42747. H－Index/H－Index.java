import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int[] max = new int[10001];
       
        for(int i = 0 ; i <= 10000; i++){
            int cnt = 0;
            for(int j = 0; j<citations.length; j++){
               if(citations[j]>=i){
                   max[i]++;
               }
            }
        }
            
        //System.out.println(Arrays.toString(max));
        
        int result = 0;
        for(int i = 0; i <=10000;i++){
            if(i<=max[i]){
                result = i;
            }
        }
        
        return result;
    }
}