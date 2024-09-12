public class minmax {
    public static void main(String args[]){
        int arr[]= {2,6,9,3,5,8,1};
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
              if(minimum > arr[i]){
                 minimum = arr[i];
               }
           // System.out.print(min);
        }
        System.out.println("Maximum number in array is: "+largest);
        System.out.print("Minimum number in array is: "+minimum);
    }
}
