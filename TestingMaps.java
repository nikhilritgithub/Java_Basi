import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
         Map <String, Integer > map = new HashMap<>();
         map.put("Virat", 18);
         map.put("Sachin", 10);
         map.put("Rohit", 45);
         map.put("Dhoni", 7);

         System.out.println(map.size());
         System.out.println(map.get("Sachin"));
        System.out.println(map.containsKey("Rohit"));
        System.out.println(map.remove("Dhoni"));
        System.out.println(map.size());
    }
}
