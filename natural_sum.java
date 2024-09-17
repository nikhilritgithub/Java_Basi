import java.util.*;
public class natural_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i=1,sum=0;

        while( i<=n ){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
