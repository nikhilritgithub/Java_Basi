public class twoD {
    public static boolean  matrixSearch(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("found at" + i+ "," + j);
                    return true;
                }
            }
        }
        System.out.println("Not dound");
        return false;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,11,12,13}};
        int key = 11;
      matrixSearch(arr,key);
    }
}
