import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<String, Integer> people = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            people.put(s, 1);
        }
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if (people.containsKey(s)) {
                people.put(s,2);
            }
        }
        ArrayList duple = new ArrayList();
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue().equals(2)) {
                duple.add(entry.getKey());
            }
        }
        Collections.sort(duple);
        System.out.println(duple.size());
        for (int i = 0; i < duple.size(); i++) {
            System.out.println(duple.get(i));
        }
    }

}