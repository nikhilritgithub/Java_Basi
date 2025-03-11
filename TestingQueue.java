import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue <Integer> quit = new LinkedList<>();
        quit.add(1);
        quit.add(2);
        quit.offer(3);

        for(Integer i : quit){
            System.out.printf("%d", i);
        }

    }
}
 