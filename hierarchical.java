public class hierarchical {
   public static void main(String args[]){
   Fish shark = new Fish();
   shark.swim();
   shark.eat();
   Birds crow = new Birds();
   crow.eat();
   } 
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eating...");
    }
    void breathe(){
        System.out.println("Breathing...");
    }
}

class Fish extends Animal{
    int fins;

    void eat(){
        System.out.println("eating pors");//function overriding
    }
    void swim(){
        System.out.println("swims in the water");
    }
}

class Birds extends Animal{
    int feather;
    void fly(){
        System.out.println("flying....");
    }
}
