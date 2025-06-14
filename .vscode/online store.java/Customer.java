import java.util.Scanner;
class Customer{
    private int id;
    private String name;
    DOO date;
    Address address;
    private Order order ;
    public Customer(){
        id=0;
        name="";
        date= new DOO();
        address= new Address();
        order= new Order();
    }
    public Customer(int id, String name,int day, String month, int year){
        this.id=id;
        this.name=name;
        this.date=new DOO(day,month,year);
        this.order=new Order();
    }
    
    public void input(Scanner scanner){
     System.out.println("Enter Customer id:");
     id=scanner.nextInt();
     scanner.nextLine();
     System.out.println("Enter Customer name:");
     name=scanner.nextLine();
     System.out.println("Enter date of order:");
     date.input(scanner);
     System.out.println("Enter Address:");
     address.input(scanner);
     
    }
    public void display(){
        System.out.println("ID:"+ id);
        System.out.println("Name:"+ name);
        System.out.println("Date:");
        date.display();
        System.out.println("Address:");
        address.dsiplay();
    }
    public int getId() { 
     return id;
    }
public void setName(String name) { 
    this.name = name; 
    }
public Address getAddress() {
     return address; 
    }
public DOO getDate() {
     return date;
 }
 public void setId(int id) {
     this.id = id;
    }
public String getName() {
     return name;
  }

public Order getOrder() {
    return order;
}

public void setOrder(Order order) {
    this.order = order;
}

}