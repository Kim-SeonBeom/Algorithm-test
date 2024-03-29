import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
    Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int cnt=  0;
        while (left<=right){
            if(left==right){
                cnt++;
               break;
            }
            if(people[left] + people[right]<=limit){
                cnt++;
                right--;
                left++;
            }else{
                cnt++;
                right--;
            }
        }
        return cnt;
}
  }  
    
    