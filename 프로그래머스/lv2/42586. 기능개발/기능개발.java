import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        int[] x = new int[speeds.length];
        int complete = 0;

        for (int i = 0; i < progresses.length; i++) {
            x[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                x[i]++;
            }
        }
                ArrayList<Integer> leadTime = new ArrayList<>();

        int cur = x[0];
        int idx = 0;
        while (idx<=x.length){
            if(idx==x.length){
                leadTime.add(complete);
                break;
            }

            if(x[idx]<=cur){
                complete++;
                idx++;
                continue;
            }
           if(x[idx]>cur){
               cur=x[idx];
               leadTime.add(complete);
               complete = 0;
           }
        }
        return leadTime;
    }
}