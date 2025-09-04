

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] words = new char[n][8];
		HashMap<Character, Integer> hm = new HashMap<>();
		ArrayList<Character> data = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int base = 0;
			for (int j = str.length() - 1; j >= 0; j--) {
				char tmp = str.charAt(j);
				int digit = (int) Math.pow(10, base);
				words[i][j + 8 - str.length()] = tmp;
				if (!hm.containsKey(tmp)) {
					hm.put(tmp, digit);
					data.add(tmp);
				} else {
					hm.put(tmp, hm.get(tmp) + digit);
				}
				base++;
			}
		}
		int sum = 0;
		int number = 9;
		ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
		Collections.sort(list, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		for (Map.Entry<Character, Integer> entry : list) {
			sum += entry.getValue() * number;
			number--;
		}

		System.out.println(sum);

	}

}
