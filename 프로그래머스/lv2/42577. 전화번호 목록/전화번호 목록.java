import java.util.Arrays;

class Solution {
    public boolean solution(String[] numbers) {
       Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i].charAt(0) == numbers[i + 1].charAt(0)) {
                if (numbers[i + 1].startsWith(numbers[i])) {
                    return false;
                }
            }
        }
        return true;
    }
        
    }
