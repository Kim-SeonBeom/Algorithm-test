import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> aList = new ArrayList<>();
        ArrayList<Character> bList = new ArrayList<>();
        ArrayList<Integer> sumList = new ArrayList<>();
        String s = br.readLine();
        String[] nums = s.split(" ");
        int size = Math.max(nums[0].length(), nums[1].length());
//        int size = nums[0].length();
        for (int i = nums[0].length()-1; i >= 0; i--) {
            aList.add(nums[0].charAt(i));
        }
        for (int i = nums[1].length()-1; i >= 0; i--) {
            bList.add(nums[1].charAt(i));
        }
        while (aList.size()<size){
            aList.add('0');
        }
        while (bList.size()<size){
            bList.add('0');
        }
//        System.out.println(aList);
//        System.out.println(bList);
        int pluscnt = 0;
        for (int i = 0; i < size; i++) {
            int first = 0;
            int ssum = 0;
            int asum = Integer.parseInt(String.valueOf(aList.get(i)));
            int bsum = Integer.parseInt(String.valueOf(bList.get(i)));
            ssum = asum + pluscnt + bsum;
            pluscnt = 0;
            if(ssum > 9){
                sumList.add(ssum-10);
                pluscnt++;
            }else if(ssum < 10){
                sumList.add(ssum);
                pluscnt = 0;
            }
            if(i == size-1){
                if(ssum>9){
                    sumList.add(1);
                }
            }
        }
//        System.out.println(sumList);
        for (int i = sumList.size()-1; i >= 0; i--) {
            System.out.print(sumList.get(i));
        }
    }
}