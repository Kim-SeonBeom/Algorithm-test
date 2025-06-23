import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();


		int[][] tri = new int[n][];
		tri[0] = new int [1];
		tri[0][0]= 1;
//		System.out.println(Arrays.toString(tri[0]));
		for (int i = 1; i < n; i++) {
			int[] tmp = new int[i+1];
			tmp[0] = 1;
			tmp[tmp.length-1]=1;
			tri[i] = tmp;
			for(int j = 1; j<tmp.length-1; j++) {
				tri[i][j]=tri[i-1][j-1]+tri[i-1][j];
			}
//			System.out.println(Arrays.toString(tmp));
		}
		System.out.println(tri[n-1][m-1]);
		
		sc.close();
	}
}