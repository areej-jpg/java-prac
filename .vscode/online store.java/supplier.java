import java.util.Scanner;
public class supplier{
 private String name;
 private int id;
public supplier( String name, int id){
 this.name=name;
 id=this.id;
}
public void input(Scanner scanner){
    System.out.println("Enter name:");
    name=scanner.nextLine();
    System.out.println("enter ID:");
    id=scanner.nextInt();
}
public void display(){
    System.out.println("Name:"+ name);
    System.out.println("ID:"+ id);
}
public int getid() { 
  return id; 
}
public void setid(int id) { 
 this.id = id;
}
public void setname(String name) { 
this.name = name; 
}

}