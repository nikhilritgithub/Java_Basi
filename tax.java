import java.util.*;
public class tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income: ");
        int x = sc.nextInt();
        int tax = 0;

        if( x<500000){
            tax = 0;
        }
       else if( x>500000 && x<1000000){
        tax = (int) (x*0.2);
       } 
       else{
        tax = (int) (x*0.3);
       }

       System.out.println("your tax = " + tax);
    }
}
