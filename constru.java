public class constru {
    public static void main(String args[]){
        Student S1 = new Student();
        S1.name = "Nikhil";
        S1.Roll = 45;

        Student s2 = new Student(S1);
        System.out.println("Name : " + s2.name  + ",  Roll no:" + s2.Roll);
    }
}

class Student{
    String name;
    int Roll;

    //copy constructor
    Student(Student S1){
        this.name = S1.name;
        this.Roll = S1.Roll;
    }
    //non-parameterized constructor
    Student(){
        System.out.println("Constructor is called");
    }

    //Parameterized constructor.
    Student(String name, int Roll){
        this.name = name;
        this.Roll = Roll;

    }
}
