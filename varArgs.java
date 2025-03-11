public class varArgs {

    public static int sum(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

public static void sentence(String ...elements){
    for(String element : elements){
        System.out.printf(element+ " ");
    }
    System.out.println();
}

    public static void main(String args[]){
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,5));
        System.out.println(sum(3,4,6));

        sentence("one", "two", "three");
        sentence("Virat", "kohli");
        sentence("He", "is", "a", "great","man");

    }
}
