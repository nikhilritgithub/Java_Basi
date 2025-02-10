public class quick {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

   public static void quickSort(int arr[], int start, int end){
    if(start < end){
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
   }

   public static int partition(int arr[], int start, int end){
    int pivelem = arr[end];
    int i = start-1;

    for(int j=start; j<end; j++){
        if(arr[j] < arr[end]){
            i++;
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    i++;
    int temp =arr[i];
    arr[i] = arr[end];
    arr[end] = temp;
    return i;
   }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
