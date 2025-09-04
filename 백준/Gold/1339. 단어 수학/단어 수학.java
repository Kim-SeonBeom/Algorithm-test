

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

//1339
class Word {
	public char alpha;
	public int digit;
	public int cnt;
	public int num;

	public Word(char alpha, int digit, int cnt) {
		super();
		this.alpha = alpha;
		this.digit = digit;
		this.cnt = cnt;
		this.num = num;
	}

}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] words = new char[n][8];
		int[][] wordToInt = new int[n][8];

		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = tmp.length() - 1; j >= 0; j--) {
				words[i][j + 8 - tmp.length()] = tmp.charAt(j);
			}
		}

//		for (char[] item : words) {
//			System.out.println(Arrays.toString(item));
//		}
		int number = 9;
		HashMap<Character, Word> hm = new HashMap<>();
		ArrayList<Character> data = new ArrayList<Character>();
		int sum = 0;

		for (int col = 0; col < 8; col++) {
			int curDigit = (int) Math.pow(10, 7 - col);
			for (int row = 0; row < n; row++) {
				char tmp = words[row][col];
				if (tmp == 0) {
					continue;
				}
				if (!hm.containsKey(tmp)) {
					Word word = new Word(tmp, curDigit, 1);
					data.add(tmp);
					hm.put(tmp, word);
				} else {
					Word word = hm.get(tmp);
					word.digit += curDigit;
					word.cnt++;
					

				}
			}
		}
		ArrayList<Word> wordList = new ArrayList<>();
		for (char item : data) {
			wordList.add(hm.get(item));
		}
		wordList.sort(Comparator.comparingInt((Word w) -> w.digit).thenComparingInt(w -> w.cnt));

		for (int i = wordList.size() - 1; i >= 0; i--) {
			wordList.get(i).num = number;
			//System.out.println(i + "번");
			//System.out.println("char  " + wordList.get(i).alpha);
			//System.out.println("digit  " + wordList.get(i).digit);
			//System.out.println("cnt  " + wordList.get(i).cnt);
			//System.out.println("num  " + wordList.get(i).num);
			//System.out.println("---------");

			number--;
		}

		for (int col = 0; col < 8; col++) {
			int curDigit = (int) Math.pow(10, 7 - col);
			for (int row = 0; row < n; row++) {
				if (words[row][col] == 0) {
					continue;
				}
				sum += hm.get(words[row][col]).num * curDigit;
			}
		}

//		for (int col = 0; col < 8; col++) {
//			for (int row = 0; row < n; row++) {
//				if (words[row][col] != 0 && !hm.containsKey(words[row][col])) {
//					hm.put(words[row][col], cnt);
//					sum += hm.get(words[row][col]) * (int) Math.pow(10, 7 - col);
//					wordToInt[row][col] = hm.get(words[row][col]) * (int) Math.pow(10, 7 - col);
//					cnt--;
//
//				} else if (words[row][col] != 0 && hm.containsKey(words[row][col])) {
//					sum += hm.get(words[row][col]) * (int) Math.pow(10, 7 - col);
//					wordToInt[row][col] = hm.get(words[row][col]) * (int) Math.pow(10, 7 - col);
//				}
//			}
//		}

//		System.out.println("---------------------------------");
//		for (int[] item : wordToInt) {
//			System.out.println(Arrays.toString(item));
//		}
//		System.out.println("---------------------------------");
		System.out.println(sum);

	}

}
