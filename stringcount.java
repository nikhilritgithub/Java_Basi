public class stringcount{
    
    public static String compress(String str){
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    } 

    public static void reverse(String str){
        char[] arr = str.toCharArray();
       int i = 0, j = arr.length-1;
       while(i < j){
          char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
       
           i++;
           j--;
       }
       
       System.out.println("reversed string is: " + new String(arr));
   }

    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println("string count is: " + compress(str));
        reverse(str);
    }
}
