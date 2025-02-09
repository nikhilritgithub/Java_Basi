import java.util.*;
public class switcas{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 20, b = 30;
        System.out.println("Enter your choice");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+' :
              System.out.println(a+b);
              break;
            case '-' :
              System.out.println(a-b);
              break;
            case '*' : 
              System.out.println(a*b);
              break;
            case '/' :
              System.out.println(a/b);
              break;
            case '%' :
              System.out.println(a%b);
              break;
            default : 
              System.out.println("Invalid Choice");
        }
    }
}