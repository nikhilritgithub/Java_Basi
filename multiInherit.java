public class multiInherit {
    public static void main(String args[]){
    Bear bhalu = new Bear();
    bhalu.eat();
    bhalu.sharp();
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void sharp();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("eat only meat");
    }
    public void sharp(){
        System.out.println("Have sharpen teeth");
    }
}
