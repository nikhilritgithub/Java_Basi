import java.util.*;
public class maxlist {

    public static int maximum(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    public static int smallest(ArrayList<Integer>list){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }


    public static void reverse(ArrayList<Integer>list){
       for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i)+ " ");
       }
       System.out.println();
    }


    public static void revrseList(ArrayList<Integer> list){
        int start = 0, end = list.size()-1;

        while(start < end){
            int temp = Integer.valueOf(list.get(start));
            list.set(start , list.get(end));
            list.set(end, temp);

            start++;
            end--;

        }

        System.out.println("Reverse list is: " + list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.print(list + " ");
    }


    public static void twoSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println("pair sum is: " + list.get(lp) + "," + list.get(rp));
                    return;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println("pair not exists");
    }

    public static void sortedRotatedSum(ArrayList<Integer> list, int target){
        int bp = -1;
        
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1, n = list.size();
        int rp = bp;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println("Pair sum is: " + list.get(lp) + "," + list.get(rp));
                return;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        System.out.println("Sum not exists");
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(6);
        // list.add(3);
        // list.add(9);
        // list.add(7);
        // list.add(6);
        // list.add(5);

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int x = maximum(list);
        System.out.println("Maximum in list is: " + x);
        int  y = smallest(list);
        System.out.println("minimum in list is: " + y);

        reverse(list);

        int idx1 = 0, idx2 = 4;
        System.out.print(list+ " ");
        swap(list, idx1, idx2);

        revrseList(list);

        int target = 18;
        //twoSum(list, target);

        sortedRotatedSum(list, target);

    }
}
