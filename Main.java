//NAME : Sarthak Patil
//PRN:23070126088
//AIML B1

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int choice;

        // Menu-driven loop for user interaction
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    // Adding a new student
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    
                    System.out.print("Enter PRN: ");
                    long prn = scan.nextLong();
                    scan.nextLine(); // Consume newline
                    
                    System.out.print("Enter DOB (dd/MM/yyyy): ");
                    Date dob = null;
                    try {
                        dob = sdf.parse(scan.nextLine());
                    } catch (ParseException e) {
                        System.out.println("Invalid date format!");
                        break;
                    }
                    
                    System.out.print("Enter Marks: ");
                    double marks = scan.nextDouble();
                    
                    operations.addStudent(new Student(name, prn, dob, marks));
                }
                case 2 -> operations.displayStudents(); // Displaying all students
                
                case 3 -> {
                    // Searching student by PRN
                    System.out.print("Enter PRN to search: ");
                    long prn = scan.nextLong();
                    Student student = operations.searchByPRN(prn);
                    System.out.println(student != null ? "Student Found:\n" + student.display() : "Student not found.");
                }
                
                case 4 -> {
                    // Searching student by Name
                    System.out.print("Enter Name to search: ");
                    String name = scan.nextLine();
                    Student student = operations.searchByName(name);
                    System.out.println(student != null ? "Student Found:\n" + student.display() : "Student not found.");
                }
                
                case 5 -> {
                    
                    System.out.print("Enter position to search: ");
                    int position = scan.nextInt();
                    Student student = operations.searchByPosition(position);
                    System.out.println(student != null ? "Student Found:\n" + student.display() : "Student not found.");
                }
                case 6 -> {
                    // Updating student details
                    System.out.print("Enter PRN to update: ");
                    long prn = scan.nextLong();
                    scan.nextLine(); // Consume newline
                    
                    System.out.print("Enter new name: ");
                    String name = scan.nextLine();
                    
                    System.out.print("Enter new marks: ");
                    double marks = scan.nextDouble();
                    
                    operations.updateStudent(prn, name, marks);
                }
                
                case 7 -> {
                    //delete student
                    System.out.print("Enter PRN to delete: ");
                    long prn = scan.nextLong();
                    operations.deleteStudent(prn);
                }
                
                case 8 -> System.out.println("Exiting program.");
                
                default -> System.out.println("Invalid choice! Please try again.");
                
                
            }
        } while (choice != 8);
        
        scan.close();
    }
    
}
