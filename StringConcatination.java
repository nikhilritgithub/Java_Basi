public class StringConcatination {

    public static String concatenate(String ...strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(concatenate("virat"));
        System.out.println(concatenate("virat" + "Kohli"));
        System.out.println(concatenate("virat"+ "Kohli" + "is"+ "the best Finisher"));
        System.out.println(concatenate("virat"+ "Jersy No. 18" + "is" + "the" + "best"));
    }
}
