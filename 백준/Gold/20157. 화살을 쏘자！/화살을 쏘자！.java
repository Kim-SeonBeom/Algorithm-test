import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static int GCD(int x, int y) {
        if (y == 0) return x;
        return GCD(y, x % y);
    }

    public static void main(String[] args)throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int max = 0;

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i <n ; i++) {
                int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int x = tmp[0];
                int y = tmp[1];

                int gcd = Math.abs(GCD(x, y));
                String slope = (y / gcd) +"/"+(x /gcd);

                if(map.containsKey(slope)){
                    map.put(slope,map.get(slope)+1);
                }else{
                    map.put(slope,1);
                }   
            }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(max,entry.getValue());
           // System.out.println("[key]:" +entry.getKey() + ", [value]:" + entry.getValue());
        }

        System.out.println(max);




        }

}
