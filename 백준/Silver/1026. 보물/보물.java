import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Integer [] arr1 = new Integer[n];
        int [] arr2 = new int[n];
//        int [] arr3 = new int[n];

//        for (int i = 0; i < n; i++) {
//            pq.add(Integer.parseInt(st.nextToken()));
//        }
        for (int i = 0; i < n; i++) {
           arr1[i] = Integer.parseInt(st.nextToken());
//           arr3[i] = arr1[i];
        }
        s = br.readLine();
        st = new StringTokenizer(s);
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

//        for (int i = 0; i < n; i++){
//            int idx = -1;
//            int max = -1;
//            for (int j = 0; j < n; j++) {
//                if(arr3[j]>max){
//                    max = arr3[j];
//                    idx = j;
//                }
//            }
//            arr2[idx] = pq.poll();
//            arr3[idx] = 0;
//        }
        Arrays.sort(arr1,Comparator.reverseOrder());
        Arrays.sort(arr2);

//        System.out.println(Arrays.toString(arr3));
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1[i] * arr2[i];
        }
        System.out.println(sum);

    }

}