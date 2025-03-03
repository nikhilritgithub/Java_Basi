import java.util.*;
public class passwordChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to password checker");
        String originalPass = "nikhil321";
       String password;
        do{
            System.out.println("Enter your password");
             password = sc.next();
        }while(!password.equals(originalPass));
        System.out.println("Phone unloked");
    }
}
