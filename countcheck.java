public class countcheck {
    public static void countElement(int arr[][]){
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
            if(arr[i][j]== 6){
                count ++;
            }
         } 
     }
        System.out.println("ELement count is: "+ count);
    }
    public static void main(String args[]){
        int arr[][] = {{3,2,4,6},{4,5,6,7,6}};
        countElement(arr);
        
    }
}
