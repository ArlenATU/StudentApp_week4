package ie.atu.week4;

public class Student {
    private String name;
    private String email;
    private String course;

    public Student() {
        this.name = "Unknown";
        this.email = "Unknown";
        this.course = "Unknown";
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setCourse(String course) {
        this.course = course;
    }

    void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Course: " + this.course);
    }
}
