public class binary {

    public static int BinarSearch(int nums[], int key){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start + end) / 2;

            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid]> key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int arr[] = {2,4,6,8,9,12,14,18};
        int key = 14;
        int index = BinarSearch(arr, key);
        System.out.println("Element found at index: " + index);
    }
}
