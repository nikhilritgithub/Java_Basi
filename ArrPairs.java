public class ArrPairs {
    public static void PrintPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            //int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String arr[]){
        int nums[] = {2,4,6,8,10};
        PrintPairs(nums);
    }
}
