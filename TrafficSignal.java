import javax.management.RuntimeErrorException;

public class TrafficSignal {

    public enum TrafficColor{
        Red(9000), 
        Yellow(1000), 
        Green(3000);

        private final int onTimeInMillis;
        

        public int getOnTimeInMillis() {
            return onTimeInMillis;
        }


        TrafficColor(int onTimeInMillis){
            this.onTimeInMillis = onTimeInMillis;
        }
    }
    
    public static class TrafficLightThread extends Thread{
        
        private final TrafficColor color;

        public TrafficLightThread(TrafficColor color){
            this.color = color;
        }

        @Override
        public void run() {
           System.out.printf("%s active\n", color);

           try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
             throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", color);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColor.Red);
        TrafficLightThread Yellow = new TrafficLightThread(TrafficColor.Yellow);
        TrafficLightThread Green = new TrafficLightThread(TrafficColor.Green);

        Green.start();
        Green.join();
        Yellow.start();
        Yellow.join();
        red.start();
    }
}
