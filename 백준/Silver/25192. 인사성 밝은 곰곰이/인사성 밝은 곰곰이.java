
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
//		System.out.println("시작전 사이즈 체크 : " + set.size());
//		System.out.println("시작전 cnt 체크 : " + cnt);

		for (int i = 0; i < n; i++) {
//			System.out.println("루프 시작전 사이즈 체크 : " + set.size());
			String sTmp = sc.next();
			if (sTmp.equals("ENTER")) {
//				System.out.println("enter 전 사이즈 체크 : " + set.size());
				cnt += set.size();
//				System.out.println("cnt 변동 체크 : " + cnt);
				set.clear();
//				System.out.println("enter 후 초기화 체크 : " + set.size());
				continue;
			}
			set.add(sTmp);
//			System.out.println("enter 아닐때 사이즈 증가 체크 : " + set.size());
		}
//		System.out.println("모든 입력값 종료");
		cnt += set.size();

		System.out.println(cnt);

	}
}