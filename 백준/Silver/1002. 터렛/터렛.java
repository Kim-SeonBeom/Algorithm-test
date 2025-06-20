
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();

			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			double d = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5); // 두 중심간의 거리계산

			if (d == 0 && r1 == r2) { // 중심도 같고 반지름도 같음 ->동심원임
				System.out.println(-1);
			} else if (r1 + r2 < d || Math.abs(r1 - r2) > d) { // 중심간의 거리가 반지름의 합보다 크면 만나지 않음 || 중심간의 거리가 반지름의 차보다
																// 작음(중심이 같고 반지름의 길이가 다른경우도 포함됨)
				System.out.println(0);
			} else if (r1 + r2 == d || Math.abs(r1 - r2) == d) { // 두원이 내접하거나 외접함
				System.out.println(1);
			} else 								// 그 외의 경우는 두점에서 만남 |r1-r2|<d<r1+r2 인 경우
				System.out.println(2);

		}
		sc.close();

	}
}