import java.util.*;
public class element {
    public static int getLargest(int arr[]){  // function to print the largest element in the array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int arr[]){  // function to print the smallest element in the array..
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
       int arr[] = {2,3,7,8,91,12,6};
    //    int x = getLargest(arr);
    //    System.out.println("largest element is "+ x);
    //    int y = getSmallest(arr);
    //    System.out.println("smallest element is "+ y);

       int arr2[] = {22,31,67,15,87,56,4};
       Arrays.sort(arr2);
       System.err.print(Arrays.toString(arr2));
       System.out.println("largest element is: " + arr2[arr2.length-1]);
       System.out.println("Smallest elemnt is: " + arr2[0]);

    }
}
