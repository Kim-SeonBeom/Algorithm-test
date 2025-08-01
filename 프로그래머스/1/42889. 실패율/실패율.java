import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] curStageMember = new int[N];
        double member = stages.length;
        int idx = -1;
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                continue;
            }
            idx = stages[i] - 1;
            curStageMember[idx]++;
        }
        double[][] stageNfailrate = new double[N][2];
        for (double i = 0; i < N; i = i + 1) {
            if (i == 0) {
                stageNfailrate[(int) i][0] = i + 1;
                stageNfailrate[(int) i][1] = (double) curStageMember[(int) i] / member;
            } else {
                member -= (double) curStageMember[(int) (i - 1)];
                if (member <= 0) {
                    stageNfailrate[(int) i][0] = i + 1;
                    stageNfailrate[(int) i][1] = 0;
                } else {
                    stageNfailrate[(int) i][0] = i + 1;
                    stageNfailrate[(int) i][1] = (double) curStageMember[(int) i] / member;

                }
            }

        }
        Arrays.sort(stageNfailrate,new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1],o1[1]);
            }
        });
        int[] answer = new int[stageNfailrate.length];
        for (int i = 0; i < stageNfailrate.length; i++) {
            answer[i] = (int)stageNfailrate[i][0];
        }
    
        return answer;
        
    }
}