import javax.security.auth.callback.ChoiceCallback;

public class abstraction {
    public static void main(String args[]){
     Cow c1 = new Cow();
     c1.run();
     c1.color();

     Chicken ch = new Chicken();
     ch.run();
     ch.color();

    }
}

abstract class Animal{
   String color;

   void eat(){   //non-abtract method
    System.out.println("Animal is eating");
   }

   abstract void run(); // abstract method
   abstract void color();
}

class Cow extends Animal{
    void run(){
        System.out.println("Run on 4 legs");
    }

    void color(){
        System.out.println("cow color is brown");
    }

    void type(){
        System.out.println("Cow type is jersy");
    }
}

class Chicken extends Animal{
   void run(){
    System.out.println("Run on 2 legs");
   }

   void color(){
    System.out.println("Chicken color is yellow");
   }
}
