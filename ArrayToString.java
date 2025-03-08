public class ArrayToString {
    public static void main(String args[]){
        String arr[] = new String[]{"Virat","kohli", "is", "the", "best", "bastman", "in", "the", "world"};

        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        } 
        System.out.println(sb);
    }
}
