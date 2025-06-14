import java.util.Scanner;
public class Person {
    private String name;
    private int id;
    Address address;
    DOB dob;
    public Person(){
        name="";
        id=0;
        address= new Address(); 
        dob= new DOB();
    }
  public void input(Scanner scanner){
    scanner.nextLine();
    System.out.println("Enter name:");
    name=scanner.nextLine();
    System.out.println("Enter id:");
    id=scanner.nextInt();
    scanner.nextLine();
    address.input(scanner );
    dob.input(scanner);
  } 
 public void display(){
    System.out.println("Name:"+ name);
    System.out.println("id:"+id);
    address.dsiplay();
    dob.display();
 }
 public DOB getdob(){
    return dob;
 }
 public Address getaddress(){
    return address;
 }
 public int getid(){
    return id;
 }
 public String getname(){
    return name;
 }
 public void setName(String name) {
    this.name=name;
 }
 

}
