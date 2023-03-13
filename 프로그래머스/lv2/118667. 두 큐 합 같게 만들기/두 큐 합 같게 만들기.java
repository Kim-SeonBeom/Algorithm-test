import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        long total = 0;
        long max = Integer.MIN_VALUE;
        long aSum = 0;
        long bSum = 0;
        Queue<Integer> aQueue = new LinkedList<>();
        Queue<Integer> bQueue = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
            aSum += A[i];
            aQueue.add(A[i]);
            max = Math.max(max, B[i]);
            bSum += B[i];
            bQueue.add(B[i]);
        }
                total = aSum + bSum;
        if (total % 2 == 1 || max > total / 2) {
            return -1;
        }

        int cnt = 0;
        int x = 0;
        while (aSum != bSum) {
            if(cnt>A.length*3){
               return -1;
            }
            if (aSum > bSum) {
                x = aQueue.poll();
                aSum-=x;
                bSum+=x;
                bQueue.add(x);
            }else if(aSum < bSum){
                x = bQueue.poll();
                bSum-=x;
                aSum+=x;
                aQueue.add(x);
            }
            cnt++;
        }
		return cnt;
    }
}