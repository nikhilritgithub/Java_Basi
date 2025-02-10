public class recurse {

    public static void printInc(int n){
      if(n==1){
        System.out.print(n+ " ");
        return;
      }

        printInc(n-1);
        System.out.print(n+ " ");
    }


    public static void printDec(int n){
       
       if(n==1){
        System.out.print(n+ "" );
        return;
       }
       
        System.out.print(n+ " ");
        printDec(n-1);
    }


    public static int fact(int n){
      if(n==1){
        return 1;
      }
      int fnm1 = fact(n-1);
      int fn = n * fact(n-1);
      return fn;
      }


      public static int sum(int n){
        if(n==1){
          return 1;
        }

        int fnm1 = sum(n-1);
        int fn = n + sum(n-1);
        return fn; 
       }


       public static int fib(int n){
        if(n==0 || n==1){
          return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        return fnm1 + fnm2;
       }

    public static void main(String args[]){
    int n = 10;
       printInc(n);
       printDec(n);
       System.out.println(fact(5));
       System.out.println(sum(5));
       System.out.println(fib(n));
    }
}
