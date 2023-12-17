package OOP_Assignment1.InheritanceStudentPostgraduate;

public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        if(averageMark == 5.0) {
            return 200;
        }
        else {
            return 180;
        }
    }
}
