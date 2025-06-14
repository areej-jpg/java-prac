import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private String program;
    private double GPA;
    private ArrayList<Registeredcourse> registeredCourses = new ArrayList<>();

    public Student() {
        program = "";
        GPA = 0.0;
    }

    public ArrayList<Registeredcourse> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setprogram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter Program:");
        program = scanner.nextLine();
        GPA = 0.0;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Program: " + program);
        System.out.println("GPA: " + GPA);
    }

    public void registerCourse(Course c) {
        for (int i = 0; i < registeredCourses.size(); i++) {
            Registeredcourse rc = registeredCourses.get(i);
            if (rc.getCourse().getcourseid() == c.getcourseid()) {
                System.out.println("Already registered.");
                return;
            }
        }
        Registeredcourse newRC = new Registeredcourse(c) {
        };
        registeredCourses.add(newRC);
        System.out.println("Course registered.");
    }
}
