import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int x = sc.nextInt();
        while( x>0 ){
            int lastDigit = x % 10;
            System.out.print(lastDigit);
            x = x/10;
        }
    }
}
