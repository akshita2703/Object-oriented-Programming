import java.util.*;

class Student{
    private String name ;
    private List<Course> courses;
    Student(String name){
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getName(){
        return name ;
    }

    public void displayAllCourse(){
        for(int i =0;i < courses.size();i++){
            System.out.println("Course: "+ courses.get(i).getName());
        }
    }
}

class Course{
    private String name;
    private List<Student> students;
    Course(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getName(){
        return name;
    }
     public void displayAllStudent(){
        for(int i =0;i < students.size();i++){
            System.out.println("Student: "+ students.get(i).getName());
        }
    }

}

public class Association3 {
    public static void main(String[] args) {
        Course math = new Course("Maths");
        Course cs = new Course("Computer Science");

        Student akshita = new Student("Akshita Rastogi");
        Student avni = new Student("Avni Rastogi");
        Student renu = new Student("Renu Singh");

        renu.addCourse(cs);
        renu.addCourse(math);

        math.addStudent(renu);
        cs.addStudent(renu);

        akshita.addCourse(cs);
        cs.addStudent(akshita);

        avni.addCourse(math);
        math.addStudent(avni);
        System.out.println("Courses enrolled by Renu:");
        renu.displayAllCourse();
        System.out.println("Students enrolled in Maths:");
        math.displayAllStudent();
        akshita.displayAllCourse();
        cs.displayAllStudent();
        avni.displayAllCourse();
        math.displayAllStudent();

    }
    
}
