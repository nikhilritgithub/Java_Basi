import java.util.*;
public class TestingList {
    public static void main(String args[]){
        List  myList = new ArrayList();
        myList.add("Virat");
        myList.add("Kohli");
        myList.add(18);
        myList.add("the great");
        myList.add("Batsman");
        

         myList.add(2,"Sachin");
         myList.add(2,"and");

        myList.remove(3);
        for(int i=0; i< myList.size(); i++){
            System.out.print(myList.get(i) + " ");
        }
    }
}
