import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
//        for (int i = 0; i < m; i++){
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }
        int pack_min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            pack_min = Math.min(pack_min, arr[i][0]);
        }

        int prise = 0;
        if(arr[0][1]*(n%6)>=pack_min){
            prise = pack_min*((n/6)+1);
        }else prise = (pack_min*(n/6))+arr[0][1]*(n%6);
        prise = Math.min(prise, arr[0][1]*n);
        System.out.println(prise);

    }

}




