import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.offer("P001");
        q.offer("P002");
        q.offer("P003");
        q.offer("P004");
        q.offer("P005");

        if(!q.isEmpty()){
            System.out.println(q.remove());
        }

        if(!q.isEmpty()){
            System.out.println(q.remove());
        }

        q.offer("P006");
        q.offer("P007");

        System.out.println("Next = "+q.peek());

        System.out.println("Waiting = "+q.size());

        System.out.println(q);

        System.out.println("FIFO = First In First Out");
    }
}