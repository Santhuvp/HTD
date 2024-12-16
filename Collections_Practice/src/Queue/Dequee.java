package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequee {
    public static void main(String[] args) {
        Deque d1=new ArrayDeque();
        d1.add("Add");
        d1.addFirst(123);
        d1.offer('c');
        d1.addLast(true);
        System.out.println(d1);

        System.out.println(d1.contains('c'));

        System.out.println(d1.peek());
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());

        d1.push(45.4444);
        System.out.println(d1);

        d1.pop();
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);
        d1.pollFirst();
        System.out.println(d1);
    }
}
