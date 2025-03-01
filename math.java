import java.util.*;

public class math {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println(Math.abs(-987));
        // System.out.println(Math.floor(4.89));
        // System.out.println(Math.ceil(4.87));
        // System.out.println(Math.random());

        // for(int i=0; i<=15; i++){
        // int random = (int)Math.round(Math.random()*20);
        // System.out.print(random + " ");
        // }

        String name = "virat";
        int run = 90;

        System.out.println("Hello " + name + " your score is: " + run);

        System.out.printf("hello %s your score is: %d", name, run);

        StringBuilder sb = new StringBuilder("First");
        sb.append(name);
        sb.append(run);
        sb.append("kohli");
        sb.append(18);
        System.out.println(sb);
    }
}
