public class diagonal {
    public static void diagonalSum(int arr[][]){
        int sum =  0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
            if(i!= arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        System.out.println("diagonal sum is: " + sum);
    }

    public static int search(int arr[][], int key){
        int row = 0, col = arr[0].length-1;
        while(row < arr.length && col>=0){
            if(arr[row][col] == key){
                System.out.print(row + "," + col);
                return key;
            }
            else if(arr[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return -1;
    }

    public static void occurence(int arr[][]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 5){
                    count++;
                }
            }
        }
        System.out.println("element count is: " + count);
    }


    public static void rowSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[1][i];
        }
        System.out.println("Row sum is: " + sum);
    }


    public static void colSum(int arr[][]){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][2];
        }
        System.out.println("column sum is: " + sum);
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},
                       {5,6,7},
                       {3,4,5}};
                       
        int key = 9;
        search(arr, key); 
        diagonalSum(arr);
        occurence(arr);
        rowSum(arr);
        colSum(arr);
    }
}
