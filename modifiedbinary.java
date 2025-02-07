public class modifiedbinary {

    public static int search(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[start] <= arr[mid]){
                if(arr[start] <= key && key <= arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid] <= key && key<=arr[end]){
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
        int arr[] = {6,7,8,9,1,2,3,4};
        int key = 1;

        int res = search(arr, key);
        System.out.println("key found at: " + res);
    }
}
