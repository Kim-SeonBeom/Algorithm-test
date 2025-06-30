
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> hm = new HashMap<>();
		HashMap<String, Integer> mh = new HashMap<>();

		String tmp;
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			hm.put(i + 1, tmp);
			mh.put(tmp, i + 1);
		}
		for (int i = 0; i < m; i++) {
			tmp = br.readLine();
			if (tmp.matches("\\d+")) {
				int x = Integer.valueOf(tmp);
				System.out.println(hm.get(x));
			} else {
				System.out.println(mh.get(tmp));
			}

		}

	}

}