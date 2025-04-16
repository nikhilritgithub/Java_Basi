public class substring{

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
       // String str = "viratkohli";
       String str2 = "RohitSharma";
        System.out.println(subString("virat kohli", 2, 5));
    }
}