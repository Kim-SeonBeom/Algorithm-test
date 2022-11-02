import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rock = sc.nextInt();
//        if(rock%3!=0){
//        int cnt = 0;
//        cnt += rock / 3;
//        rock = rock % 3;
//        System.out.println("cnt = " + cnt);
//        System.out.println("rock= " + rock);
//        if (rock == 0 && cnt > 1) {
//            rockzero(cnt);
//        }else {
//            cnt+= rock;
//            if(cnt%2 ==0){
//                System.out.println("SK");
//            }else System.out.println("CY");
//        }
//    }
//
//    public static void rockzero(int cnt) {
//        if (cnt % 2 == 0) {
//            System.out.println("CY");
//        } else System.out.println("SK");
//    }
        if(rock%2==0){
            System.out.println("SK");
        }else System.out.println("CY");
    }
}