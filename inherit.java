public class inherit {
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();

        Cat bs = new Cat();
        bs.sleep();
        bs.weight = 4;
        System.out.println(bs.weight);

        Dog d1 = new Dog();
        d1.run();
        d1.breed = "labrador";
        System.out.println(d1.breed);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eating...");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal{
    int weight;

    void run(){
        System.out.println("Running");
    }
}

class Dog extends Cat {
    String breed;
    void bark(){
        System.out.println("barking");
    }
}
