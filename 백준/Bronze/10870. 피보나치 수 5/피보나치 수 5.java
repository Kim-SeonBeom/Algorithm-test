import java.util.*;
public class Main {
    public static int pibonachi(int n){
        if(n==0){
            return 0;
        }else if(n ==1){
            return 1;
    }else {
            return pibonachi(n-1)+pibonachi(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pibonachi(n));
    }
}