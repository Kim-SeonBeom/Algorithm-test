import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int cnt = 1; 
        Set<Integer> set = new HashSet<>();
      for(int h= 0; h<n;h++){
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j=i; j<i+cnt;j++){

                sum+=elements[j%n];

            }

           
            set.add(sum);

        }
           cnt++;
      }
        return set.size();
    }
}