
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int smallCase = n - m > m ? m : n - m;

//		System.out.println(smallCase);
		int[] childs = new int[smallCase];
		int[] parents = new int[smallCase];
		for (int i = 0; i < smallCase; i++) {
			childs[i] = n--;
			parents[i] = i + 1;
		}
		int[] primeNum = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
//		System.out.println(Arrays.toString(childs));
//		System.out.println(Arrays.toString(parents));

		for (int i = smallCase - 1; i >= 0; i--) {
			for (int j = 0; j < smallCase; j++) {
				if (parents[i] == 1)
					continue;
				if (childs[j] % parents[i] == 0) {
					childs[j] /= parents[i];
					parents[i] = 1;
				} else {
					for (int k = 0; k < primeNum.length; k++) {
						if (childs[j] % primeNum[k] == 0 && parents[i] % primeNum[k] == 0) {
							childs[j] /= primeNum[k];
							parents[i] /= primeNum[k];
						}
					}
				}
			}
		}
//		System.out.println(Arrays.toString(childs));
//		System.out.println(Arrays.toString(parents));
		
		BigInteger child = new BigInteger("1"); 
		BigInteger parent = new BigInteger("1"); 

		for (int i = 0; i < smallCase; i++) {
			String intTmp = String.valueOf(childs[i]);
			BigInteger tmp = new BigInteger(intTmp); 
			child = child.multiply(tmp);
			intTmp = String.valueOf(parents[i]);
			tmp = new BigInteger(intTmp); 
			parent = parent.multiply(tmp);

		}
//		System.out.println(child);
//		System.out.println(parent);
		System.out.println(child.divide(parent));


	}
}
