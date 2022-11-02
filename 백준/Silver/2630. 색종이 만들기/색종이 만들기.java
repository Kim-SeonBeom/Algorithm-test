import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{

    static int white = 0;
    static int blue = 0;
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for(int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);

    }

    public static void divide(int x, int y, int size) {
        if(isEqual(x, y, size)) {
            if(paper[x][y] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        int dividedSize = size / 2;
        divide(x + dividedSize, y, dividedSize);                   //1사분면
        divide(x, y, dividedSize);                                 //2사분면
        divide(x, y + dividedSize, dividedSize);                   //3사분면
        divide(x + dividedSize, y + dividedSize, dividedSize);     //4사분면
    }

    public static boolean isEqual(int x, int y, int size) {
        int sum = 0;
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                sum += paper[i][j];
            }
        }
        if(sum==0 || sum==Math.pow(size,2)){
            return true;
        } return false;
    }
}