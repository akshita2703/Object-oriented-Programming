
class Passport{
    private String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;

    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Passport Number: " + passport.getPassportNumber());
    }
}

public class Association {
    public static void main(String[] args) {
        Passport passport = new Passport("A1234567");
        Student student = new Student("Alice", passport);
        student.displayInfo();
        
    }
}