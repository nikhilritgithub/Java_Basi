public class Dice {

    int roll(){
        double random = Math.random()*6;
        return (int) Math.ceil(random);
    }
    public static void main(String args[]){
        Dice d1 = new Dice();
        for(int i=0; i<10; i++){
            System.out.println(d1.roll());
        }
        
    }
}
