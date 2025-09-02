
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String tmp = "";

        HashMap<String, Integer> line = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            line.put(players[i],i);
        }
        for (int i = 0; i < callings.length; i++) {
            int curRank = line.get(callings[i]);
            tmp = players[curRank-1];
            players[curRank-1] = callings[i];
            players[curRank] = tmp;
            line.put(callings[i],curRank-1);
            line.put(tmp,curRank);
        }
        return players;
    }
}