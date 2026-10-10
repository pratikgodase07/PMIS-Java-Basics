package october_8th.oops;

import java.util.Scanner;

class StudentProfile {
    String fullName;
    String studentID;
    double finalExamScore;

    // Constructor 1: For Exam Takers (takes name, ID, and score)[cite: 8]
    public StudentProfile(String fullName, String studentID, double finalExamScore) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.finalExamScore = finalExamScore;
    }

    // Constructor 2: For Direct Walk-ins (takes only name and ID, score defaults to 0.0)[cite: 8]
    public StudentProfile(String fullName, String studentID) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.finalExamScore = 0.0; // Automatic initial score[cite: 8]
    }

    // Method to determine the letter grade based on academy criteria[cite: 8]
    public char calculateGrade() {
        if (finalExamScore >= 90) {
            return 'A'; //[cite: 8]
        } else if (finalExamScore >= 75) {
            return 'B'; //[cite: 8]
        } else if (finalExamScore >= 50) {
            return 'C'; //[cite: 8]
        } else {
            return 'F'; //[cite: 8]
        }
    }

    // Method to print the complete report card (name, ID, score, and grade)[cite: 8]
    public void printReportCard() {
        System.out.println("\n====== STUDENT REPORT CARD ======");
        System.out.println("Full Name   : " + fullName);
        System.out.println("Student ID  : " + studentID);
        System.out.println("Exam Score  : " + finalExamScore);
        System.out.println("Letter Grade: " + calculateGrade());
        System.out.println("=================================\n");
    }
}

public class AcademyAdmissionsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Let's register two students as required by the task[cite: 8]:
        // 1. Exam Taker (with an exam score, e.g., 82.5)[cite: 8]
        // 2. Direct Walk-in (with no initial score)[cite: 8]

        System.out.println("--- Registering Student 1 (Exam Taker) ---");
        System.out.print("Enter full name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String id1 = scanner.nextLine();
        System.out.print("Enter actual exam score (e.g., 82.5): ");
        double score1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline leftover

        // Using Constructor 1 for Exam Taker[cite: 8]
        StudentProfile student1 = new StudentProfile(name1, id1, score1);

        System.out.println("\n--- Registering Student 2 (Direct Walk-in) ---");
        System.out.print("Enter full name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String id2 = scanner.nextLine();

        // Using Constructor 2 for Direct Walk-in (score automatically starts at 0.0)[cite: 8]
        StudentProfile student2 = new StudentProfile(name2, id2);

        // Print out both report cards[cite: 8]
        System.out.println("\nGenerating Report Cards...");
        student1.printReportCard();
        student2.printReportCard();

        scanner.close();
    }
}
