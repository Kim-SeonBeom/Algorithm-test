import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(Integer i : set)
        {
            result[index++] = i;
        }
        Arrays.sort(result);
        
        return result;
    }
}