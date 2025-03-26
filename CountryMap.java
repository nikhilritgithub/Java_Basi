import java.util.HashMap;
import java.util.*;
public class CountryMap {
    
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Pakistan", "Islamabd");
        countryMap.put("China", "Beijing");
        countryMap.put("Sri lanka", "coloumbo");


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the country name: ");
        String country = sc.next();

        if(countryMap.containsKey(country)){
            System.out.printf("capital of %s is %s ", country,countryMap.get(country));
        }else{
            System.out.println("Sorry We don't know the capital");
        }
    }
}
