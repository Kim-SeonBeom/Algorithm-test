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
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
