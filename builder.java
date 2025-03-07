import java.util.*;
public class builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        // for(char ch ='a'; ch<='z'; ch++){
        //     sb.append(ch+ " ");
        // }

        // System.out.print(sb+ " ");

        for(Integer i=1; i<=30; i++){
            sb.append(i + " ");
        }
        System.out.println(sb);
        System.out.print(sb.getClass());
    }
}
