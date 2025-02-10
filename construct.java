public class construct {
    public static void main(String args[]) {
        Candidate c1 = new Candidate();
        City c2 = new City("Patna");
        System.out.println(c2.name);
    }
}

class Candidate {
    String name;
    int roll;

    Candidate() { // non parameterized....
        System.out.println("Constructor is called");
    }
}

class City {
    String name;
    int population;

    City(String name) { // parameterized constructor...
        this.name = name;
    }
}
