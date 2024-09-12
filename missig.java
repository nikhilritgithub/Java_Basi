public class missig {

    public static int misssingNum(int arr[]){
               int n = arr.length+1;
                int expectedSum = n*(n+1)/2;
                int actualSum = 0;
              for(int i=0; i<arr.length; i++){
                actualSum += arr[i];
              }
              int missingElem = expectedSum - actualSum;

              return missingElem;
            
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,5};
        //misssingNum(0, arr);
        System.out.println(misssingNum(arr));
    }
}
