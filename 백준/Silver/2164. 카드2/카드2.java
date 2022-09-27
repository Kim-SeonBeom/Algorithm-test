import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Queue queue = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            queue.add((int)i);
        }
        while(queue.size() > 1){
            queue.remove();
            int data = (int)queue.remove();
            queue.add((int)data);
        }
        System.out.println(queue.remove());

    }
}