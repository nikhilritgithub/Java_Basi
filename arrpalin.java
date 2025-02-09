import java.util.*;
public class arrpalin {

    public static void isPalindrome(int arr[]){
        boolean isPalin = true;
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]){
                isPalin = false;
                break;
            }
        }
        if(isPalin){
            System.out.println("palindromic array");
        }
        else{
            System.out.println("Not a palindromic array");
        }
    }


    public static void isArraylistPalin(ArrayList<Integer> num){
        int n = num.size();
        for(int i=0; i<num.size()/2; i++){
            if(num.get(i) == num.get(n-1-i)){
                System.out.println("Arraylist is a plaindrome");
                break;
            }
            else{
                System.out.println("arraylist is not a  palindrome");
                break;
            }
        }
    }



    public static void isStringPalindrome(String str){
        int n = str.length();
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) == str.charAt(n-1-i)){
                System.out.println("string is palindrome");
                break;
            }
            else{
                System.out.println("Not a palindrome");
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,2};
        //isPalindrome(arr);

        String str = "raceca";
        //isStringPalindrome(str);

        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);

        System.out.println(list);
        isArraylistPalin(list);
    }
}
