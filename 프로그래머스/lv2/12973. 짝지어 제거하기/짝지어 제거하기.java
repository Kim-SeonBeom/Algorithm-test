import java.util.Stack;


class Solution
{
    public int solution(String s)
    {
       Stack<Character> box = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            box.add(s.charAt(i));
            if(box.size()>=2){
                if(box.get(box.size()-1)==box.get(box.size()-2)){
                    box.pop();
                    box.pop();
                }
            }
        }
        if(box.size()==0){
            return 1;
        }else
            return 0;


    }
}