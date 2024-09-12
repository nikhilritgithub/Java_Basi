public class largesttwo {
    public static void Largest(int arr[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                if(largest < arr[i][j]){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+ largest);
    }
    public static void Smallest(int arr[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(smallest > arr[i][j]){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("smallest element is:" + smallest);
    }

    public static void main(String args[]){
        int  matrix[][] = {{1,2,3,11},{4,5,6,12},{7,8,9,14}}; // 4*3 matrix row -major

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Largest(matrix);
        Smallest(matrix);
    } 
}
