public class primeFun {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i =2; i<=n; i++){
            if( n % i == 0){
                return false;
        }
    }
    return true;
}

    public static void range(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        //System.out.println(isPrime(3));

        range(25);
    }
}

