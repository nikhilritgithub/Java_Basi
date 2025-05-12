import java.util.*;
import java.util.Scanner;
public class twodArray {

    public static int [] Search(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == key){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int diagonalSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        return sum;
    }

    public static int stairSearch(int arr[][], int key){
        int row = arr.length, col = arr[0].length;

        while( row < arr.length && col >= 0){
            if(arr[row][col] == key){
                return key;
            }
            else if(arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Elements in table");
        //  for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        //  }

        //  for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();

        
        int matrx[][] = {{1,4,5},{7,8,9},{23,12,45}};
        int[] result = Search(matrx, 5);
        if(result[0] != -1){
            System.out.println("key found at:" + result[0] + "," + result[1]);
        }
        else{
            System.out.println("key not found");
        }

        System.out.println(diagonalSum(matrx));
     }
 }
