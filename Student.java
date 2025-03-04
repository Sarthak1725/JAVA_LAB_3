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

    
}

