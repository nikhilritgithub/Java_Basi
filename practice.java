public class practice {

    public static int stairSearch(int arr[][], int key){
        int row = 0;
        int col = arr[0].length-1;

        while(row < arr.length && col >= 0){
        if(arr[row][col] == key){
            System.out.println("found at: " + row +","+ col);
            return key;
        }
        else if(arr[row][col] > key){
            col--;
        }
        else{
            row++;
        }
    }
        System.out.println("Not found");
        return -1;
    }
    public static int Binary(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        

        return -1;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int key = 3;
        stairSearch(arr, key);
    }
}
