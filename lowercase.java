import java.util.*;
public class lowercase {

    public static void LowerCaseCount(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String sstrr = sc.next();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = sstrr.charAt(i);
            for(int j= 'a'; j<='z'; j++){
                count++;
            }
        }
        System.out.println("Lowercase count is: " + count);
    }
    public static void main(String args[]){

        String str = "Nikhil MEhta";
        LowerCaseCount(str);
    }
}
