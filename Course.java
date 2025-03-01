public class Course {
    String courseName;
    int enrolledstudents;
    static int maxCapacity;

    static{
        maxCapacity = 0;
    }
    {
        maxCapacity++;
    }
    Course(String courseName, int maxCapacity){
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
    }

    static void getMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    public static void main(String args[]){

    }
}
