class Solution {
    public int solution(int[][] arr) {
        int tmp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][1] < arr[i][0]){
                tmp = arr[i][1];
                arr[i][1] = arr[i][0];
                arr[i][0] = tmp;
            }
        }
        int a = 0;
        int b = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][0] > a){
                a = arr[i][0];
            }
            if(arr[i][1] > b){
                b = arr[i][1];
            }
        }
        return a*b;
    }
}