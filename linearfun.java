import java.util.*;
public class linearfun {

    public static int LinearSearch(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {3,4,5,6,7,8,9};
        int key = 7;
        int found = LinearSearch(nums, key);
        if(found == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+ found);
        }
    }
}
