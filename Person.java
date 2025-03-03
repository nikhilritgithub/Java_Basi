public class Person {
    
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

    public static void main(String args[]){
        Person p1 =new Person("Nikhil", 20, "001");
        Person p2 =new Person("Nikhil", 20, "001");

        if(p1.equals(p2)){
            System.out.println("Equals");
        }else{
            System.out.println("not equals");
        }
    }   
    
}
