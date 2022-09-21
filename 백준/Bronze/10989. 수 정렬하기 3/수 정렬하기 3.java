import java.io.*;
import java.util.*;


public class Main {
    public static int max(int n[]) {
        int max = n[0];

        for (int i = 1; i < n.length; i++)
            if (n[i] > max) max = n[i];

        return max;
    }
    public static int min(int n[]) {
        int min = n[0];

        for (int i = 1; i < n.length; i++)
            if (n[i] < min) min = n[i];

        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int arr_max = max(arr);
//        System.out.println(arr_max);
        int arr_min = min(arr);
//        System.out.println(arr_min);
        int[] counting = new int [arr_max+1];
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }
        for (int i = arr.length -1; i >=0 ; i--) {
            int value = arr[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

}







