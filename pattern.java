public class pattern{


    public static void p1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static void p2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static void p4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds(int n){
        int count = 1;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void p5(int n){
        int count = 1;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void p6(int n){
        int count = 15;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count --;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // p1(5);
        // p2(5);
        //p3(5);
        //p4(5);
       // floyds(5);
      // p5(5);
      p6(5);
    }
}