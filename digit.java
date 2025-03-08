import java.util.*;
public class digit {
    public static void digitSum(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Digit sum is: " + sum);
    }
    public static void main(String args[]){
        digitSum();
    }
}
