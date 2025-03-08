  import java.util.*;
  public class first {
    
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to calculator");
      System.out.println("Enter a number");
      int a = sc.nextInt();
      System.out.println("Enter second number");
      int b = sc.nextInt();
     

      try{
        int result = a / b;
        System.out.printf("Result is %d",result);
      }catch(ArithmeticException exception){
        if(exception.getMessage().equals("/ by zero")){
          System.out.println("Divided by zero Occured");
        }else{
          throw exception;
        } 
      }
    }
}
 