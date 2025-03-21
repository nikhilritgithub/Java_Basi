import java.io.InterruptedIOException;

public class ThreadHandling {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleep");
        Thread.sleep(5000);
        System.out.println("Ho gya Uth Jao");
    }
}
