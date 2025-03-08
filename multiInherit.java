public class multiInherit {
    public static void main(String args[]){
        Dog max = new Dog();
            max.eat();
        max.color = "white";
        max.weep();
        System.out.println(max.color);
        
    }
}

 class Animal{
    String color;

    void eat(){
        System.out.println("Eating....");
    }
    void weep(){
        System.out.println("Weeping....");
    }
    void run(){
        System.out.println("Running");
    }
}


 class Mammal extends Animal{
    int legs;
 }


 class Dog extends Mammal{
    String size;
 }
