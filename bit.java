public class bit {

   public static void OddOrEven(int n){
    int bitmask = 1;
    if((n & bitmask) == 0){
        System.out.println("Binary number is even");
    }
    else{
        System.out.println("Binary number is not even");
    }
   }


   public static int GetBit(int n, int i){
    int bitmask = 1 << i;
    if((n & bitmask) == 0){
        return 0;
    }
    return -1;
   }

    public static void main(String args[]){

        System.out.println( 6 & 7);

        System.out.println( 7 | 8);

        System.out.println( 8 | 9);

        System.out.println( 7 ^ 8);

        System.out.println( ~ 6);

        System.out.println( 4 << 2);
        
        System.out.println( 4 >> 2 );

        OddOrEven(110);

      System.out.println(GetBit(10, 2));
    }
}
