import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
                int cnt = 0;
        Stack<Integer> bucket = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i]-1;
            
            for (int j = 0; j < board.length; j++) {
                if (board[j][x] != 0) {
                    if(!bucket.isEmpty()&&board[j][x]==bucket.peek()){
                        System.out.println("제거! : "  + bucket.pop());
                        board[j][x] = 0;
                        cnt++;

                        break;
                    }
                    bucket.add(board[j][x]);
                    
                    board[j][x] = 0;
                    break;
                }
            }
        }
        return cnt*2;
    }
}