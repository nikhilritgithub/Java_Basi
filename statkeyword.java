public class statkeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "KV";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}      

class Student{
    String name;
    int roll;

    static String schoolName;
    void setName(String name){
        this.name = name;
    }

    void getName(){
        this.name = name;
    }
}
