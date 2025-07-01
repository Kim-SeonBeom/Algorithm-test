
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		int m;
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			System.out.println(combination(n, m));
		}
		sc.close();

	}

	static Long combination(int n, int m) {

		ArrayList<Integer> parent = new ArrayList<>();
		ArrayList<Integer> child = new ArrayList<>();
		for (int i = m; i > m - n; i--) {
			child.add(i);
		}

		for (int i = 1; i <= n; i++) {
			parent.add(i);
		}
//		System.out.println(child.toString());
//		System.out.println(parent.toString());
		for (int i = 0; i < child.size(); i++) {
			for (int j = 0; j < parent.size(); j++) {
				if (child.get(i) == 1 || parent.get(j) == 1)
					continue;
				int c_tmp = child.get(i);
				int p_tmp = parent.get(j);
				if (c_tmp % p_tmp == 0) {
					child.remove(i);
					child.add(i, c_tmp / p_tmp);
					parent.remove(j);
					parent.add(j, 1);
				}

			}
		}
//		System.out.println(child.toString());
//		System.out.println(parent.toString());
		
		Long cResult = 1L;
		Long pResult = 1L;
		for(int item : child) {
			cResult *= item;
		}
		for(int item : parent) {
			pResult *= item;
		}
//		System.out.println("cResult = " + cResult);
//		System.out.println("pResult = " + pResult);

		return cResult/pResult;
	}
}
