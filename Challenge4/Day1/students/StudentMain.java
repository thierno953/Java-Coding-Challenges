package Challenge4.Day1.students;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("John", 23, 83.3));
        students.add(new Student("Pierre", 27, 93.6));
        students.add(new Student("Axel", 21, 43.3));

        System.out.println("Average grade: " + calculateAvg(students, students.size()));
        printGradeAbove(students, 90);
    }

    public static double calculateSum(ArrayList<Student> students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum;
    }

    public static double calculateAvg(ArrayList<Student> students, int length) {
        return calculateSum(students) / length;
    }

    public static void printGradeAbove(ArrayList<Student> students, int grade) {
        System.out.println("Students who scored above " + grade + ":");
        for (Student student : students) {
            if (student.getGrade() > grade) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
}
