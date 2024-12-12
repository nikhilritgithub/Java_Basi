import java.util.*;
public class calci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter operation which you want to perform: ");
        char ch = sc.next().charAt(0);

        switch(ch) {
            
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
               break;
            case '*' : System.out.println(a*b);
               break;
            case '%' : System.out.println(a%b);
               break;
            case '/' : System.out.println(a/b);
               break;
            default : System.out.println("wrong choice");
        }
    }
}
