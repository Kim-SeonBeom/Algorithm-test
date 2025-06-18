import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
//10814번

class Member {
	int number;
	int age;
	String name;

	Member(int number, int age, String name) {
		this.number = number;
		this.age = age;
		this.name = name;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Member> pq = new PriorityQueue<>(new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				if (o1.age < o2.age) {
					return -1;
				} else if (o1.age == o2.age) {
					if (o1.number < o2.number) {
						return -1;
					} else
						return 1;
				} else
					return 1;
			}
		});

		int n = sc.nextInt();
//		Member[] members = new Member[n];
		for (int i = 0; i < n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
//			members[i] = new Member(i, age, name);
//			System.out.println(i +" "+age + " " + name);
			pq.add(new Member(i, age, name));
		}
//		System.out.println(pq.size());
		Member tmp;

//		System.out.println("현재 개수 : " + pq.size());
		for (int i = pq.size(); i > 0; i--) {
			tmp = pq.poll();
			System.out.println(tmp.age + " " + tmp.name);
//			System.out.println("꺼낸 개수 : " + pq.size());
//			System.out.println("남은 개수 : " + (i ));
		}
		
		
		
		
		
		 
		
	}
	
	
	

}