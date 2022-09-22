import java.util.Arrays;
class Solution {
    public int[] solution(int[] answer) {
        int[] result = {};
        int[] supo_1st = {1,2,3,4,5};
        int[] supo_2nd = {2,1,2,3,2,4,2,5};
        int[] supo_3rd = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt_1st = 0;
        int cnt_2nd = 0;
        int cnt_3rd = 0;
        int max_score = -1;
        int same_cnt = 0;
        int max_idx = -1;
        
        for (int i = 0; i < answer.length; i++){
            if(answer[i] == supo_1st[i % supo_1st.length]){
                cnt_1st++;
            }
            if(answer[i] == supo_2nd[i % supo_2nd.length]){
                cnt_2nd++;
            }
            if(answer[i] == supo_3rd[i % supo_3rd.length]){
                cnt_3rd++;
            }
        }
        int[] score = new int[3];
        score[0] = cnt_1st;
        score[1] = cnt_2nd;
        score[2] = cnt_3rd;
        
                for (int i = 0; i < score.length; i++) {
            if(score[i] > max_score){
                max_score = score[i];
                max_idx = i;
                same_cnt = 1;
            }else if(score[i] == max_score){
                same_cnt++;
            }
        }
        if(same_cnt == 1){
            result = new int[1];
            result[0] = max_idx+1;
        } else if(same_cnt > 1){
            result = new int[same_cnt];
            int x = 0;
            for(int i = 0; i < score.length; i++) {
                if (score[i] == max_score){
                    result[x] = i+1;
                    x = x + 1;
                }
            }
        }
        
        
        return result;
    }
}