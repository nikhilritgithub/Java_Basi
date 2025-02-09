public class pairs {

    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j]+ ")" );
            }
            System.out.println();
        }
    }


    public static void subArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

   public static void maxSubarraySum(int arr[]){
    int sum = 0;
    int ms = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        sum += arr[i];
        if(sum < 0){
            sum = 0;
        }
        ms = Math.max(sum, ms);
    }
    System.out.println("maximum subarray sum is: " + ms);
   }
    public static void main(String args[]){
        int arr[]  = {2,4,6,8,10};
         printPairs(arr);
         subArray(arr);
         maxSubarraySum(arr);
    }
}
