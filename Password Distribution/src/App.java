import java.util.Iterator;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("Carlos", 1));
        queue.add(new Patient("Alan", 1));
        queue.add(new Patient("José", 0));
        queue.add(new Patient("Bianca", 1));
        
        Iterator<Patient> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }
    }
}
