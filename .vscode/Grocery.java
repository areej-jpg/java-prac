import java.util.ArrayList;
import java.util.Scanner;
class DOO{
    private int day;
    private String month;
    private int year;
    public DOO(){
        day=0;
        month="";
        year=0;
    }
    public void input(Scanner scanner){
    System.out.println("Enter date:");
    day=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter month:");
    month=scanner.nextLine();
    System.out.println("Enter year:");
    year=scanner.nextInt();
    }
    public void display(){
        System.out.println("Date:"+ day);
        System.out.println("Month:"+ month);
        System.out.println("Year:"+ year);
    }
    public String getmonth(){
        return month;
    }
    public void setdate(int day){
        this.day=day;
    }
    public void setmonth(String month){
        this.month=month;
    }
    public void setyear(int year){
        this.year=year;
    }

}
class item{
    private int itemid;
    private String itemname;
    private int qtyinstock;
    private int price;
    public item(){
        itemid=0;
        itemname="";
        qtyinstock=0;
        price=0;
    } 
    public void input(Scanner scanner){
       System.out.println("Enter item id:");
       itemid=scanner.nextInt();
       scanner.nextLine();
       System.out.println("Enter item name:");
       itemname=scanner.nextLine();
       System.out.println("Enter number of items available in stock:");
       qtyinstock=scanner.nextInt();
       System.out.println("Enter price of item:");
       price=scanner.nextInt();

    }
    public void display (){
        System.out.println("Item ID:"+ itemid);
        System.out.println("Item name:"+ itemname);
        System.out.println("Quantity in stock:"+ qtyinstock);
        System.out.println("Price:"+ price);
    }

}
class Customer{
    private int id;
    private String name;
    public Customer(){
        id=0;
        name="";
    }
    public void input(Scanner scanner){
     System.out.println("Enter Customer id:");
     id=scanner.nextInt();
     scanner.nextLine();
     System.out.println("Enter Customer name:");
     name=scanner.nextLine();
     
    }
    public void display(){
        System.out.println("ID:"+ id);
        System.out.println("Name:"+ name);
    }
}
class order{
    private ArrayList<item> shoppingcart;
    private DOO date;
    public order(){
        shoppingcart= new ArrayList<>();
        date=new DOO();
    }
   public void addItemToCart(item i) {
    shoppingcart.add(i); 
}


}

public class Grocery{
    static  Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
      int opt=-1;
      while(opt!=0){
        System.out.println("1.To add items to grocery store");
        System.out.println("2.To add customer info");
        System.out.println("3.To view all items present bat grocery store");
        System.out.println("4.To add items to your order");
        System.out.println("5.To view customer info");
        System.out.println("6.To edit your order");
        System.out.println("7.To edit customer info");
        System.out.println("8.To view your order");
        switch(opt){

        }
      }
  }
}