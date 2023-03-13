import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution
{
    public int solution(int []A, int []B)
    {
          int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0, j = B.length - 1; i < A.length && j >= 0; i++, j--) {
            sum += A[i] *B[j];
        }
        System.out.println(sum);
        return sum;
    }
}