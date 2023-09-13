class Solution {
    public int[] solution(int brown, int yellow) {
       int[] result = new int[2];

        int size = brown + yellow;

        for (int i = 3; i < size / 2 + 1; i++) {
            if (size % i == 0) {
                int x = size / i;
                if (2 * i + 2 * x - 4 == brown) {
                result[0] = i;
                result[1] = x;
                }
            }
        }
        return result;
    }
}