import java.util.Arrays;
import java.util.*;
public class swapInList {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list);
        swap(list, 3, 6);
        System.out.println("list after Swap = " + list);
    }
    
    public static void swap(List <Integer> list, int x, int y){

        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}
