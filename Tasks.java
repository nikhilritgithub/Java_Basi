public class Tasks {
    public static class FirstTask extends Thread{
    @Override
    public void run() {
         //first Task
         for(int i=1; i<=1000; i++){
            System.out.print("*" + i);
        }
        System.out.println("\n * task completed");

    }
}
    public static  class SecondTask extends Thread{
        @Override
        public void run() {
              //Second Task
         for(int i=1; i<=1000; i++){
            System.out.print("$" + i);
        }
        System.out.println("\n $ task completed");
        }
    }

    public static class ThirdTask extends Thread{
        @Override
        public void run() {
              //Third Task
         for(int i=1; i<=1000; i++){
            System.out.print("#" + i);
        }
        System.out.println("\n # task completed");
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting first Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken is: " + (endTime- startTime) + "milliseconds");
    }
}

