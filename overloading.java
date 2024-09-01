public class overloading {

    public static void sum(int a , int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String args[]){

        sum(4,6);
        sum(4,6,5);
    }
}
