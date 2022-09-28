// import java.util.*;
// class Solution {
//     boolean solution(String s) {
//         Queue<Character> queue = new LinkedList<>();
//         for(int i = 0; i< s.length(); i++){
//             queue.add(s.charAt(i));
//         }
//         int cnt = 0;
        
//             while(queue.size()>0){
//                 if(queue.poll().equals('(')) {
//                     cnt++;
//                 }else cnt--;
                
//                 if(cnt<0){
//                     return false;
//                 }
//             }
//             if(cnt == 0){
//                 return true;
//             }else return false;
//         }
//     }
class Solution {
    boolean solution(String s) {
       boolean answer = true;
        char[] carray = s.toCharArray();
        int cnt=0;
        for(char c : carray){
            if(c=='('){
                cnt++;
            }else if(c==')'){
                if(cnt>0){
                    cnt--;
                }else {
                    answer=false;
                    break;
                }
            }
        }
        if(cnt!=0){
            answer=false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
