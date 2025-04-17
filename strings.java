import java.util.*;
public class strings {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.next();
        // System.out.println("your name is: "+name);

        // System.out.println(name.length());



        // System.out.println("Enter first name");
        // String firstName = sc.next();
        // System.out.println("Enter last name");
        // String lastName = sc.next();
        
        // String fullName = firstName +" "+ lastName;
        // System.out.println("your name is: " + fullName);

        // System.out.println(fullName.length());

        // System.out.println(fullName.charAt(4));

        printLetters("Virat kohli");
    }
}
