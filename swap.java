import java.util.*;
public class swap {

    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
      
        System.out.println(a);
        System.out.println(b);
    }
    public static int fact(int n){
        int fact = 1;
       // int n = 5;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
    //   int a = 20; 
    //   int b = 30;
        
    //     Swap(a,b);

    int res = fact(5);
    System.out.println(res);
     }
}
