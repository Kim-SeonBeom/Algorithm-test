import java.util.*; 

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        int count = 0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int max = 0;
        for(int tan : tangerine){
            if(map.get(tan) == null)
                map.put(tan,1);
            else
                map.put(tan, map.get(tan)+1);
        }
        
        map = map.entrySet()
         .stream()
         .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
         .collect(LinkedHashMap::new,
                  (m, e) -> m.put(e.getKey(), e.getValue()),
                  LinkedHashMap::putAll);
 

        for(int i : map.keySet()){
            sum += map.get(i);
            count++;
         
            if(sum >= k)
                return count;

                    }
         return count;
                }
    
 }
