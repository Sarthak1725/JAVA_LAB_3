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

     // Method to search student by position
     public Student searchByPosition(int position) {
        if (position >= 0 && position < students.size()) {
            return students.get(position);
        }
        return null;
    }

     // Method to update student details
     public void updateStudent(long prn, String newName, double newMarks) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(newName);
            student.setMarks(newMarks);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
     // Method to delete a student
     public void deleteStudent(long prn) {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    
   

    
 

   

   

   
  
}
