import java.util.Arrays;
import java.util.Scanner;


public class Main{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double X = sc.nextDouble();
    int n = 0;
    if(X==1){
    	System.out.println("1");
    }else {
    	for(int i=0; i<Math.sqrt(X); i++) {
    		if(i*(i-1)>=(X-1)/3) {
    		break;
    		}
    		n++;
    	}System.out.println(n);
  
    }
 }
} 
 