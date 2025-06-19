import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tmp;
		for (int i = 0; i < n; i++) {
			tmp = sc.next();
			if (tmp.length() % 2 == 0 && isVPS(tmp)) { // 문자열의 길이가 홀수이면 바로 NO, 짝수면 isVPS로 확인
				System.out.println("YES");
			} else // 문자열의 길이가 홀수인 경우 이거나, isVPS가 false 인 경우
				System.out.println("NO");
		}
		sc.close();
	}

	static boolean isVPS(String s) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (cnt < 0) { // cnt가 음수가 된다면 VPS가 될수 없음
				return false;
			}
			if (s.charAt(i) == '(') // '('가 나올때마다 cnt를 1씩증가
				cnt++;
			else // ')'가 나올때마다 cnt를 1씩 감소 =>음수가 되었다는 것은 '('가 선행하지 않았다는 뜻 =>VPS가 될수 없음
				cnt--;
		}
		return cnt == 0 ? true : false; // 종료 시 cnt가 양수이면 '('후에 ')'가 나오지 않았음 => VPS가 될 수 없음
	}
}