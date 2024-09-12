public class kadens {
    class Solution {

        // arr: input array
        // Function to find the sum of contiguous subarray with maximum sum.
        long maxSubarraySum(int[] arr) {
    
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            boolean allNegative = true;
            
            for(int i=0; i<arr.length; i++){
                cs += arr[i];
                if(cs < 0){
                    cs =0;
                }
                ms = Math.max(cs,ms);
                
        
                if(arr[i] >= 0 ){
               allNegative = false;
            }
         }
           
           if(allNegative){
               return -1;
           }
           return ms;
        }
    }
    
}
