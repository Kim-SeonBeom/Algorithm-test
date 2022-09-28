import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(br.readLine());
      }
      int max = a[a.length - 1];
      int cnt = 1;
      for (int i = a.length-1; i >= 0; i--){
          if(max<a[i]){
              max = a[i];
              cnt++;
          }
      }
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      bw.write(String.valueOf(cnt));
      bw.close();

    }

}