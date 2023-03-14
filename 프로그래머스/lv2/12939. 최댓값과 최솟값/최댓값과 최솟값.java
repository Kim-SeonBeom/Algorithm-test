import java.util.Arrays;

class Solution {
    public String solution(String s) {
                int[] arr = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        String answer = min + " " + max;
        return answer;
    }
}