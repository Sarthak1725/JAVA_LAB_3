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

    
   

    
 

   

   

   
  
}
