import java.util.*;

class Solution {
    public static HashMap<Character, Integer> hm = new HashMap<>();
    public int solution(String skill, String[] skill_trees) {
        int cnt = 0;

        for (int i = 0; i < skill.length(); i++) {
            hm.put(skill.charAt(i), i);
        }
        for (int i = 0; i < skill_trees.length; i++) {
            if (check(skill_trees[i])) {
                cnt++;
            }
        }

        return cnt;
    }

    public static boolean check(String skillTree) {
        int cur = 0;
        for (int i = 0; i < skillTree.length(); i++) {
            if (hm.containsKey(skillTree.charAt(i))) {
                if (hm.get(skillTree.charAt(i)) > cur){
                    return false;
                }else cur++;
            }
        }
        return true;
    }
}