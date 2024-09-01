public class smallest {

    public static void Smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(smallest> arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in arry is: " + smallest);
    }
    public static void main(String args[]){

        int arr[] = {3,4,6,9,6,54,2,3};
        Smallest(arr);
    }
}
