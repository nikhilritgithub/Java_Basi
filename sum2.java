import java.util.Scanner;
public class sum2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter another number");
        int y = sc.nextInt();

        int sum = x+y;
        System.out.println(sum);
    }
}
