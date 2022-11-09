import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] d = new int [n][3];
        String s;

        StringTokenizer st ;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            for (int j = 0; j < 3; j++) {
                d[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                switch(j){
                    case 0 :
                        d[i][0] += Math.min(d[i-1][1],d[i-1][2]);
                        break;
                    case 1 :
                        d[i][1] +=Math.min(d[i-1][0],d[i-1][2]);
                        break;
                    case 2 :
                        d[i][2] +=Math.min(d[i-1][1],d[i-1][0]);
                        break;
                }
            }
        }
        System.out.println(Math.min(Math.min(d[n-1][1],d[n-1][2]),d[n-1][0]));

  }
}

