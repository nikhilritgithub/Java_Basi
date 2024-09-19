public class recrs {

    // public static void printIncr(int n){
    //     if(n==30){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n+ " ");
    //     printIncr(n+1);
    // }


    //print number in increasing order...
    public static void printIncr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncr(n-1);
        System.out.println(n+ " ");
    }


    //prinnt number in decreasing order...
    public static void printDer(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDer(n-1);
    }


    //find factorial of a number..
    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }



    //sum of n natural number...
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + sum(n-1);
        return sn;
    }


    //fibonacci number
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        return fnm1 + fnm2;
    }



   // first n fibonacci
    public static long[] printFibb(int n) 
    {
        if (n <= 0) {
            return new long[0]; 
        }

        long[] fib = new long[n];
        
       
        if (n >= 1) fib[0] = 1; 
        if (n >= 2) fib[1] = 1; 

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; 
        }

        return fib;
    }

    

   public static void main(String args[]){
        //  printIncr(10);
        //  printDer(20);
       // System.err.println(fact(5));
        //System.out.println("sum is: " + sum(5));
        System.out.println(fib(11));
   }
}
