public class matrixSearch {

    public static int StairSearch(int arr[][], int key){
        int row = 0, col = arr[0].length-1;
            while(row <arr.length && col >= 0){
                if(arr[row][col]== key){
                    System.out.println("Found at "+ row + "," + col);
                    return key;
                }
                else if(arr[row][col] > key){
                    col --;
                }
                else{
                    row ++;
                }
            }
            System.out.println("Key not found");
            return -1;
    }
    public static void main(String args[]){
        int arr[][] = {{10,20,30,40},
                       {15,25,35,45},
                      {27,29,37,48},
                     {32,33,39,50}};
        
     int key = 39;
     StairSearch(arr, key);
    }
}