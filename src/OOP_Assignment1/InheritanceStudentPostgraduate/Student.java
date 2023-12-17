package OOP_Assignment1.InheritanceStudentPostgraduate;

public class Student {
    public String firstName, lastName, group;
    public double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if(averageMark == 5.0) {
            return 100;
        }
        else {
            return 80;
        }
    }
}
