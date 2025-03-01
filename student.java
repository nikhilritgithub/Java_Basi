
    public class student {
        String name;
        int age;
        String rollNo;


        public student(String name, int age, String rollNo) {
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
        }


        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Student Details:{name:"+name+", age:"+age+", roll number:"+rollNo+"}";
        }



        public static void main(String args[]) {
            student stu = new student("Nikhi", 20,"002");
            System.out.println(stu);
        }
    }

