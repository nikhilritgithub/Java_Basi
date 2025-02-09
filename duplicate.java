import java.util.*;
public class duplicate {

    public static boolean containsDuplicate(int arr[]){
        boolean seen[] = new boolean[2001];
        for(int i=0; i<arr.length; i++){
            if(seen[arr[i] + 1000]){
                return true;
            }
            seen[arr[i] + 1000] = true;
        }
        return false;
    }

    public static void removeDuplicate(int arr[]){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0; i<=j; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isDuplicate(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

    
    public static void swap(){
        int a = 10, b = 30;
        System.out.println("before Swapping: a= "+a + "b= " + b );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: a= "+a + "b= " + b );
    }

    public static int[] pairSum(int arr[] , int x){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] + arr[i+1] == x){
                return new int[]{arr[i], arr[i+1]};
            }
        }
        return null;
    }

    

    public static void main(String args[]){
        int arr[] = {10,15,11,12,14,15,16};
        // int x = 10;
        // int[] result = pairSum(arr, x);
        // if(result != null){
        //     System.out.println("pair found :" + result[0] + "," + result[1]);
        // }
        // else{
        //     System.out.println("No pair found");
        // }
        // System.out.println(containsDuplicate(arr));
       removeDuplicate(arr);
    //    System.out.println(isDuplicate(arr));
    //    swap();
    }
}
