import java.util.Iterator;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Patient> normalQueue = new PriorityQueue<>();
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        String[] names = {"Carlos", "Alan", "José", "Bianca", "Pedro", "Gustavo", "Lucas", "Marcelo", "Luiz", "Maria", "Mariza", "Bruno", "Matheus", "Jeferson", "Felipe", "Vinícius"};
        int[] priorities = {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int counter = 0;

        for (int i = 0; i < priorities.length; i++) {
            if (priorities[i] == 0) {
                priorityQueue.add(new Patient(names[i], priorities[i]));
            } else {
                normalQueue.add(new Patient(names[i], priorities[i]));
            }
            
        }
        
        Iterator<Patient> normalIterator = normalQueue.iterator();
        Iterator<Patient> priorityIterator = priorityQueue.iterator();

        while (priorityIterator.hasNext()) {
            System.out.println(priorityQueue.poll());
            counter++;

            if (counter % 3 == 0) {
                System.out.println(normalQueue.poll());
            }
        }

        while (normalIterator.hasNext()) {
            System.out.println(normalQueue.poll());
        }
    }
}
