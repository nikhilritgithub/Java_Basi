import java.util.*;
public class Recursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to factorial generator");
        System.out.println("enter your number");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("factorial of number is: "+ fact);
    }

    public static long factorial(int num){
        System.out.println("Function called for: " + num);
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);

    }
}
