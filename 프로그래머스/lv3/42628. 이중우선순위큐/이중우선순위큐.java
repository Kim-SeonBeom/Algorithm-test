import java.util.*;

class Solution {
    public int[] solution(String[] operation) {
        PriorityQueue<Integer> orderPq = new PriorityQueue<>();
        PriorityQueue<Integer> reversePq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < operation.length; i++) {
            if (operation[i].charAt(0) == 'I') {
                orderPq.add(Integer.valueOf(operation[i].substring(2)));
                reversePq.add(Integer.valueOf(operation[i].substring(2)));
            } else if (operation[i].equals("D 1")) {
                if (orderPq.isEmpty()) {
                    continue;
                }
                orderPq.remove(reversePq.poll());
            } else {
                if (orderPq.isEmpty()) {
                    continue;
                }
                reversePq.remove(orderPq.poll());
            }
        }

        int[] result = new int[2];
        if (orderPq.isEmpty()) {
            result[0] = 0;
            result[1] = 0;
        } else {
            result[0] = reversePq.peek();
            result[1] = orderPq.peek();
        }
        return result;
    }
}