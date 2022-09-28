class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr5 = new String[n];
        for (int i = 0; i < n; i++) {
            String s = String.format("%"+n+"d", Long.parseLong(Integer.toBinaryString( arr1[i] | arr2[i])));
            arr5[i] = s;
            for (int j = 0; j < arr5[i].length(); j++) {
                if (arr5[i].charAt(j) == '0') {
                    arr5[i] = arr5[i].replaceAll("0", " ");
                } else arr5[i] = arr5[i].replaceAll("1", "#");
            }
        }
        return arr5;
    }
}