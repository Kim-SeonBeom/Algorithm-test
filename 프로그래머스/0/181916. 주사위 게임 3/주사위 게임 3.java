import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;
        ArrayList<int[]> cnt = new ArrayList<>();
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=0){
                cnt.add(new int[]{arr[i],i});
            }
        }
        Collections.sort(cnt, (o1,o2) -> o1[0]-o2[0]);
        for(int i = 0; i<cnt.size(); i++){
            System.out.println(Arrays.toString(cnt.get(i)));
        }
        if(cnt.size()==1){
            return cnt.get(0)[1]*1111;
        }else if(cnt.size()==2){
            if(cnt.get(0)[0]==1){
               int tmp = cnt.get(1)[1]*10 + cnt.get(0)[1];
                return tmp*tmp;
            }else return (cnt.get(1)[1]+cnt.get(0)[1])*(cnt.get(1)[1]-cnt.get(0)[1]);
        }else if(cnt.size()==3){
            System.out.println(cnt.get(0)[1]*cnt.get(1)[1]);
            return cnt.get(0)[1]*cnt.get(1)[1];
        }else
            return cnt.get(0)[1];
    }
}