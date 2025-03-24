public class Multithreading {
    
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        //first Task
        for(int i=1; i<=1000; i++){
            System.out.print("*" + i);
        }
        System.out.println("\n * task completed");

         //Second Task
         for(int i=1; i<=1000; i++){
            System.out.print("$" + i);
        }
        System.out.println("\n $ task completed");

         //Third Task
         for(int i=1; i<=1000; i++){
            System.out.print("#" + i);
        }
        Thread.sleep(10000);
        System.out.println("\n # task completed");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d",(endTime-startTime));
    }
}
 