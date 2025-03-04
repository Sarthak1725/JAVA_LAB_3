import java.util.*;

// Class for handling student operations (CRUD)
class StudentOperations {
    private ArrayList<Student> students;

    // Constructor to initialize the student list
    public StudentOperations() {
        this.students = new ArrayList<>();
    }

     // Method to add a student to the list and sort by PRN
    
    public void addStudent(Student student) {
        students.add(student);
        students.sort(Comparator.comparingLong(Student::getPRN)); // Sorting by PRN
        System.out.println("Student added successfully.");
    }
    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student.display());
        }
    }

    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }

      // Method to search student by Name
      public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    
   

    
 

   

   

   
  
}
