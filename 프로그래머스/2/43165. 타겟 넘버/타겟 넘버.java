class Solution {
    int cnt = 0;
    
    public int solution(int[] numbers, int target) {
        int position = 0;
        int sum = 0;
        plusDfs(numbers, position, target,sum);
        minusDfs(numbers, position, target,sum);
        return cnt/2;
    }
    
    void plusDfs(int[] numbers, int position, int target,int sum){
        if(numbers.length==position){ 
            if(target==sum) {
                cnt++;
                //System.out.println(cnt + "번 성공" );
            }
            return;
        }
        sum +=numbers[position];
        //System.out.println("position : " + position + ", sum : " + sum);
        plusDfs(numbers, position+1, target, sum);
        minusDfs(numbers, position+1, target, sum);
    }
    
    void minusDfs(int[] numbers, int position, int target,int sum){
         if(numbers.length==position){
            if(target==sum) {
                cnt++;
                //System.out.println(cnt + "번 성공" );
            }
            return;
        }
        sum -=numbers[position];
       // System.out.println("position : " + position + ", sum : " + sum);
        plusDfs(numbers, position+1, target,sum);
        minusDfs(numbers, position+1, target, sum);
    }
}