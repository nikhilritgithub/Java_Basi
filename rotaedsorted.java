public class rotaedsorted {
    public static int search(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[start] <= arr[mid]){
                if(arr[start] <= key && key<= arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid+1] <= key && key<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,6,7,8,2,3,4};
        int key = 2;
       int x =  search(arr,key);
       System.out.println("Element found at: " + x);
    }
}
