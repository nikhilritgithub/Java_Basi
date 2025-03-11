import java.util.*;
public class TestingCollections {
    public static void main(String[] args) {
        List <Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(2);
        myList.add(8);
        myList.add(-87);

        Collections.sort(myList);

        for(int i : myList){
            System.out.println(i);
        }
    }
}
