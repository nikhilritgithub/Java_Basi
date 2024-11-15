public class star {

    public static void halftriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void ultatriangle(int n){
        for(int i=0; i<=n ; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number(int n){
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void spaceHalf(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void flyodstriangle(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       halftriangle(5);
       ultatriangle(5);
       number(5);
       spaceHalf(5);
       flyodstriangle(5);
    }
}
