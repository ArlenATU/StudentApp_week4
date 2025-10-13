package ie.atu.week4;

public class Student {
    // Fields to store student details
    private String name;
    private String email;
    private String course;

    // Default constructor initializing fields to "Unknown"
    public Student() {
        this.name = "Unknown";
        this.email = "Unknown";
        this.course = "Unknown";
    }

    // Parameterized constructor to set all fields on creation
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Setter methods to update student details
    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setCourse(String course) {
        this.course = course;
    }

    // Getter methods to retrieve student details
    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    String getCourse() {
        return course;
    }

    // String representation of the student object
    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Course: " + course;
    }

}
