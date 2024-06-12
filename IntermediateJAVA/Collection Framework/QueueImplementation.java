import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        Queue<Integer> q2 = new LinkedList<>(q);
        
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q2);
    }
}
