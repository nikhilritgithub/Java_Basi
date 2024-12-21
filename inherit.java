public class inherit {
    public static void main(String args[]){
        Fish dolphin = new Fish();
        dolphin.eat();
        dolphin.swim();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eating....");
    }

    void breathe(){
        System.out.println("Breathing.....");
    }


}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim in water");
    }
}
