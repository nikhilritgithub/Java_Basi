public class pg1 {
    public static class FirstThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello from Thread 1");
        }
    }

    public static class SecondThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello from Thread 2");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FirstThread f1 = new FirstThread();
        SecondThread s2 = new SecondThread();

        f1.start();

        Thread.sleep(5000);
        s2.start();
        
    }
}
