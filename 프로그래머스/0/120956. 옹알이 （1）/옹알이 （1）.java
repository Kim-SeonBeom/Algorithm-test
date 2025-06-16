class Solution {
    public int solution(String[] babbling) {
        String[] speak = { "aya", "ye", "woo", "ma" };
        int answer = 0;
        		for (int i = 0; i < babbling.length; i++) {
			String tmp = babbling[i];
			for (int j = 0; j < speak.length; j++) {
				String compare = speak[j];
				if(tmp.contains(compare)){
//					System.out.println("포함합니다.");
					String newTmp = tmp.replaceAll(compare, " ");
//					System.out.println(newTmp);
					tmp = newTmp;
				}
			}
			tmp = tmp.replace(" ","");
			if(tmp.length()==0) answer++;

		}
        
         
        return answer;
    }
}