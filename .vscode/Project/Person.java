import java.util.Scanner;
public abstract class Person{
    private String name;
    private int ID;
    private String email;
    private Address address;

 public Person(){
    name="";
    ID=0;
    email="";
    address=new Address();
 }
 public void input(Scanner scanner){
    System.out.println("Enter Name:");
    name=scanner.nextLine();
    System.out.println("Enter Registration ID:");
    ID=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter Email:");
    email=scanner.nextLine();
    address.input(scanner);

 }
 public void display(){
    System.out.println("Name:"+ name);
    System.out.println("Registration ID:"+ID);
    address.dsiplay(); 
 }
 public void setname(String name){
   this.name=name;
 }
 public void setid(int ID){
   this.ID=ID;
 }
 public void setemail(String email){
   this.email=email;
 }
 public String getname(){
   return name;
 }
 public int getid(){
   return ID;
 }
 public String getemail(){
   return  email;
}
 
}                                 
