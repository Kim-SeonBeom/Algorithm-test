
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a,b,c;
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		c = sc.nextBigInteger();

		BigInteger result = a.modPow(b, c);
		System.out.println(result);
	}

}