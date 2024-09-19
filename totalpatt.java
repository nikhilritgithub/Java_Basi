public class totalpatt {
    public static void Halfpyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void invertedHalf(int n){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void invertedRotated(int n){
        for(int i=1; i<=5; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print(" ");
            }
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
        }
    }

 public static void floydsTriangle(int n){
//  1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
       int count = 1;
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
               System.out.print(count + " ");
                  count ++;
             }
             System.out.println(); 
       }
     }

     public static void zeroOne(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
     }

public static void solidRohmbus(int n){
    for(int i=0; i<=n; i++){
        for(int j=0; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=0; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String args[]){
        Halfpyramid(5);
        System.out.println();
       invertedHalf(5);
       System.out.println();
      invertedRotated(5);
      System.out.println();
      floydsTriangle(5);
      System.out.println();
     zeroOne(5);
     System.out.println();
     solidRohmbus(4);
    }
}
