import java.util.Scanner;
class item{
    private int itemid;
    private String itemname;
      private String category;
    private int price;
    private int qtyinstock;
  
    public item(){
        itemid=0;
        itemname="";
        qtyinstock=0;
        price=0;
        category="";
    } 
   public item(int itemid, String itemname, String category, int qtyinstock, int price) {
    this.itemid = itemid;
    this.itemname = itemname;
    this.category = category;
    this.qtyinstock = qtyinstock;
    this.price = price;
}
public void input(Scanner scanner) {
        System.out.println("Enter item id:");
        itemid = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter item name:");
        itemname = scanner.nextLine();
        System.out.println("Enter category:");
        category = scanner.nextLine();
        System.out.println("Enter number of items available in stock:");
        qtyinstock = scanner.nextInt();
        System.out.println("Enter price of item:");
        price = scanner.nextInt();
    }
    public void display (){
        System.out.println("Item ID:"+ itemid);
        System.out.println("Item name:"+ itemname);
        System.out.println("Quantity in stock:"+ qtyinstock);
        System.out.println("Category:"+ category);
        System.out.println("Price:"+ price);
    }
    public int itemid(){
        return itemid;
    }
    public String itemname(){
        return itemname;
    }

    public String getcategory(){
       return category;
    }
    public int getprice(){
        return price;
    }
    public int getqtyinstock(){
        return  qtyinstock;
    }
   public void setid(int itemid){
    this.itemid=itemid;
   }
   public void setitemname(String itemname){
    this.itemname=itemname;
   }
   public void setcategory(String category){
    this.category=category;
   }
   public void setqtyinstock(int qtyinstock){
      this.qtyinstock=qtyinstock;
   }
   public void setprice( int price){
    this.price=price;
   }
   

}