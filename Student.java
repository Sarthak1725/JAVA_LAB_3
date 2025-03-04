import java.util.Date;

// Class representing a student with attributes and methods
class Student {
    private String name;
    private long prn;
    private Date dob;
    private double marks;
    // Constructor to initialize Student attributes
    public Student(String name, long prn, Date dob, double marks) {
        this.name = name;
        this.prn = prn;
        this.dob = dob;
        this.marks = marks;
    }

    // Setter and Getter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
     // Setter and Getter for PRN
     public void setPRN(long prn) {
        this.prn = prn;
    }

    public long getPRN() {
        return prn;
    }

      // Setter and Getter for Marks
      public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

   // Method to display student details 
    public String display() {
        return "Name: " + name + ", PRN: " + prn + ", DOB: " + dob + ", Marks: " + marks;
    }


    
}

