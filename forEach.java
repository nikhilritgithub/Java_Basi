import java.util.*;

public class forEach {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element for occurenece");
        int elem = sc.nextInt();
        int arr[] = new int[] { 4, 5, 6, 7, 2, 3, 2, 2 };
        // Occurence(arr, elem);

        int arr2[] = { 3, 3, 4, 2, -8, -3, -4, 5, };
        sum(arr2);

        int arr3[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        printEven(arr3);
    }

    public static void Occurence(int arr[], int elem) {
        int occ = 0;
        for (int num : arr) {
            if (num == elem) {
                occ++;
            }
        }
        System.out.println("Element found " + occ + "times");
    }

    public static void sum(int arr[]) {
        int sum = 0;
        for (int num : arr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("sum of positive number = " + sum);
    }

    public static void printEven(int arr[]) {
        for (int num : arr) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.println("even numbrs are: " + num);
        }
    }

}
