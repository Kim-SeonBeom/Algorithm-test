import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] APB = new int[26];

        for (int i = 0; i < 26; i++) {
            APB[i] = -1;
//          System.out.print(APB[i]+" ");
        }
        for (int i = 0; i < S.length(); i++) {
            int idx = (int)S.charAt(i) - 97;
            if(APB[idx] == -1){
                APB[idx] = i;
            };
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(APB[i]+" ");
        }

    }
}
