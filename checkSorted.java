public class checkSorted {

    public static boolean isSorted(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<arr[i+1]){
                System.out.println("Array is sorted");
                return true;
            }
        }
        System.out.println("Array is unsorted");
        return false;
    }

    public static int sum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
       int arr[] = {2,3,4,5,6,7,8};
       isSorted(arr);
       System.out.println(sum(arr));
    }
}
