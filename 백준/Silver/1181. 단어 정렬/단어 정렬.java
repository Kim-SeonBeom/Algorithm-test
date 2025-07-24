
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(sc.next());
		}
		String[] words = new String[set.size()];
		int i = 0;
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			words[i] = iterator.next();
			i++;
		}

		Arrays.sort(words, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					int i = 0;
					while (i < o1.length()) {
						if (o1.charAt(i) == o2.charAt(i)) {
							i++;
							continue;
						} else {
							return o1.charAt(i)-o2.charAt(i);
						}

					}
					return 0;
				} else
					return o1.length() - o2.length();
			}
		});

		for (String item : words) {
			System.out.println(item);
		}

	}

}