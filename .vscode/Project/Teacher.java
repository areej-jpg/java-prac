import java.util.Scanner;
public class Teacher extends Person {
    private String designation;

    public Teacher() {
        super();
        designation = "";
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Enter Designation:");
        designation = scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}
