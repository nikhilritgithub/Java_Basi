public class binary {

    public static int search(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }



    public static void reverse(int arr[]){
        int start = 0, end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++ ;
            end --;

        }
    }

    public static void Printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String args[]){
     int arr[] = {2,3,4,5,6,7,8,9};
     int key = 6;
     int index = search(arr, key);
     //System.out.println("elemnt found at: " + index);

     reverse(arr);
     Printarray(arr);

    }
}
