class Solution {
    public int solution(int n, int m, int[] section) {
         int left = 0;
        int right = 1;
        int cnt = 0;

       while(right <= section.length-1){
           if(section[right]-section[left]+1<=m){
               right++;
               continue;
           }else {
               right--;
               cnt++;
               left = right+1;
               right = left +1;
           }
       }
       cnt++;
        return cnt;
    }
}