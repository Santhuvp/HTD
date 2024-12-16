package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class Priorityqueue
{
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<Integer>();
        q1.offer(1);
        //q1.offer(null);
        q1.offer(3);
        q1.add(54);

        System.out.println(q1);

        System.out.println(q1.peek());

        q1.poll();
        System.out.println(q1);


        System.out.println(q1.size());

    }


}
