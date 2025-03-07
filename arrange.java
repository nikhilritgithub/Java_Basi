public class arrange {

    public static void printPairs(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<=arr.length; j++){
                System.out.print("(" + arr[i] + ","+ j+ ")");
                count++;
            }
            System.out.println();
        }
      System.out.println("pairs count is: " + count);
    }
   
    public static void subArray(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("subarray count is: " + count);
    }


    public static void main(String args[]){
      int arr[] = {1,2,3,4,5,6};
     // printPairs(arr);
     subArray(arr);
    }
}
