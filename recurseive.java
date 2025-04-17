public class recurseive {

    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }


    public static void printInc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        printInc(n-1);
        System.out.print(n + " ");
    }


    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        int fnm1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }


    public static int sum(int n){
        if(n==1){
            return 1;
        }

        int snm1 = sum(n-1);
        int sn = n+sum(n-1);
        return sn;
    }

    public static int printFib(int n){
        if(n==0 || n==1){
            return n;
        }

        int fnm1 = printFib(n-1);
        int fnm2 = printFib(n-2);
        int fn = fnm1 + fnm2;

        return fn;
    }


        public static void main(String[] args) {
       // printDec(20);
        // printInc(10);
        //  System.out.println(factorial(5));
       // System.out.println(sum(5));
      System.out.println(printFib(5));
    }
}