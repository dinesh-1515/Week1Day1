package week1.day2;

public class Report {

	public static void main(String[] args) {
        // Create object for Student class
        Student student = new Student();

        // Assign values
        student.studentName = "Dinesh Kumar";
        student.rollNo = 101;
        student.collegeName = "KSR College of Engineering";
        student.markScored = 450;
        student.cgpa = 8.5f;

        // Print all variables
        System.out.println("Student Name  : " + student.studentName);
        System.out.println("Roll Number   : " + student.rollNo);
        System.out.println("College Name  : " + student.collegeName);
        System.out.println("Marks Scored  : " + student.markScored);
        System.out.println("CGPA          : " + student.cgpa);
    }

}
