public class abstraction {
    public static void main(String args[]){
        Dog max = new Dog();
        max.run();
        max.color();max.eat();

        Chicken chuja = new Chicken();
        chuja.run();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animals are eating..");
    }

   abstract void run();
   abstract void color();
}

 class Dog extends Animal{
    void run(){
        System.out.println("walk on 4 legs");
    }
    void color(){
        System.out.println("color is white");
    }
   // abstract void walk();
}

class Chicken extends Animal{
    void run(){
        System.out.println("Run on 2 legs");
    }
    void color(){
        System.out.println("Color is yellow");
    }
}
