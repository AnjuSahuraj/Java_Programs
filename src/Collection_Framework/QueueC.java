package Collection_Framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueC
{
    public static void main(String[] args)
    {
        Queue q=new PriorityQueue();
        q.offer(23);
        q.offer(12);
        q.offer(42);
        System.out.println(q);
        q.add(13);
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);

    }
}
