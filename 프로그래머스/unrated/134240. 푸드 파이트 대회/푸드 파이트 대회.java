class Solution {
    public String solution(int[] food) {
       
        StringBuilder sb= new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            if(food[i]%2==1){
                int x = (food[i]-1)/2;
                for (int j = 0; j < x; j++) {
                    sb.append(i);
                }
            }else{
                int x = (food[i])/2;
                for (int j = 0; j < x; j++) {
                    sb.append(i);
                }
            }
        }
        String result = sb.toString();
        result += "0";
        sb.reverse();
        result += sb.toString();
        return result;
    }
}