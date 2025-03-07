public class sortedmatsearch {
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        N = 0;
        M = mat[0].length-1;
        while(N < mat.length && M >= 0){
            if(mat[N][M] == X){
                return 1;
            }
            
            else if(mat[N][M] > X){
                M--;
            }
            else{
                N++;
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                       {10,13,14,18},
                      {20,30,40,50},
                      {25,26,27,28}};

        int X = 80;
       
         System.out.print(matSearch(arr, 4,4,X));

    }  
}
