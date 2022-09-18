import java.util.Arrays;
import java.util.Scanner;


public class Main{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;
    double avg = 0;

    for(int i=0; i<n; i++) {
    	int H = sc.nextInt();
    	int sco_i[] = new int[H+1];
    		sco_i[0]=H;
    	sum = 0;
    	double cnt_i = 0;
    	for(int j=1; j<sco_i.length; j++) {
    		sco_i[j]=sc.nextInt();
    	 	sum += sco_i[j];
    		}
    	avg = sum/H;
    	for(int j=1; j<sco_i.length; j++) {
    		if(sco_i[j]>avg) {
    			cnt_i++;
    		}
    	}
     double per = cnt_i/H;
     //System.out.println(sum);
     //System.out.println(avg);
     //System.out.println(cnt_i);
     System.out.println(String.format("%.3f",per*100)+"%");
     }
   }
}
    
  

