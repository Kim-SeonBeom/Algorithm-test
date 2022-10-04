import java.util.Arrays;

class Solution {
    public boolean solution(String[] numbers) {
       Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
        
                if (numbers[i + 1].startsWith(numbers[i])) {
                    return false;
                }
            
        }
        return true;
    }
        
    }
