public class reverse {
    public static int reverse(int n){
        while(n>0){
            int ld = n%10;
            System.out.print(ld);
            n = n/10;
        }
        return n;
    }


    public static int fact(int n){
        int Fact = 1;
        for(int i=1; i<=n; i++){
            Fact *= i;
        }
        return Fact;
    }

    public static void table(int n){
        for(int i=1; i<=n; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }


    public static void main(String args[]){
        int num = 3456;
        reverse(num);
        System.out.println(fact(5));
        table(10);
    }
}
