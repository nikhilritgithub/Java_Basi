public class quick {

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si < ei){
            int pivot = partition(arr,si,ei);
            quickSort(arr, si, pivot-1);
            quickSort(arr, pivot+1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei){
        int pivelem = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] < pivelem){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }
    public static void main(String args[]){
        int arr[] = {8,3,2,9,1,6,7};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
