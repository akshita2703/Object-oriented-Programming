import java.util.*;
class Student{
    private String name;
    private String id;

    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
}

class College{
    private String name;
    private List<Student> students;

    College(String name) {
        this.name = name;
        students = new ArrayList<>();
    }   

    public void addStudent(Student student){
        students.add(student);
    }

    public void printAllstudents(){
        for(int i =0;i<students.size();i++){
            System.out.println("Student Name: " + students.get(i).getName() + ", ID: " + students.get(i).getId());
        }
        
    }

}

public class Association2 {
    public static void main(String[] args) {
        
        Student student1 = new Student("John Doe", "S12345");
        Student student2 = new Student("Jane Smith", "S67890");
        College college = new College("ABC College");
        
        college.addStudent(student1);
        college.addStudent(student2);
        college.printAllstudents();
    }
    
}
