import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int times = 0;
        ArrayList<String> cache = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            if(cacheSize == 0){
                times = cities.length * 5;
                break;
            }
            if (cache.contains(cities[i])) {
                cache.remove(cities[i]);
                cache.add(cities[i]);
                times +=1;
            }else if(cache.size()>=cacheSize){
                cache.remove(0);
                cache.add(cities[i]);
                times +=5;
            }else{
                cache.add(cities[i]);
                times +=5;
            }
        }
        return times;
    }
}