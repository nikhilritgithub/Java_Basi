public class largest {

    public static void  Largest(int arr[]){
       int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }
    public static void main(String args[]){

        int nums[] = {3,4,5,67,7,45,98};
        Largest(nums);
    }
}
