package OOP_Assignment1.InheritanceStudentPostgraduate;

public class Main {
    public static void main(String[] args) {
        Student aspirant1 = new Aspirant(
                "Bob",
                "Bob",
                "SE2333",
                5.0);
        Student student1 = new Student(
                "Alice",
                "In Wonderland",
                "SE2334",
                4.8);

        Student studentReference = aspirant1;
        System.out.println(studentReference.averageMark);

        Student[] students = new Student[2];
        students[0] = aspirant1;
        students[1] = student1;
        for (Student student : students) {
            System.out.println("Student " +
                    student.firstName +
                    " scholarship is " +
                    student.getScholarship() + "$");
        }
    }
}
