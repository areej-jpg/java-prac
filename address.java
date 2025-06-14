import java.util.Scanner;
class person{
    private String name;
    private int id;
    private String city;
    private int houseno;
   public person(){
       this.name=" ";
       this.id=0;
       this.city=" ";
       this.houseno=0;
    }
   public void getdata(Scanner scanner){
     System.out.println("Enter name:");
     name=scanner.nextLine();
      System.out.println("Enter id:");
     id =scanner.nextInt();
      System.out.println("Enter city:");
     city=scanner.nextLine();
      System.out.println("Enter houseno:");
     houseno=scanner.nextInt();

   }
   public void display(){
    System.out.println("Name: "+ name);
    System.out.println("ID: "+ id);
    System.out.println("City: " + city);
    System.out.println("House number: " + houseno);
   }
   public int getid(){
    return this.id;
   }
   public void reset(){
        this.id = 0;
        this.name = "";
        this.houseno =0;
        this.city = "";
   }
}
public class address{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opt=-1;
        int count=0;
        final int max=10;
        int searchid=0;
        person[]persons=new person[max];

        while(opt !=0){
        System.out.println("1.To create a person.");
        System.out.println("2.To view all person");
        System.out.println("3.To view a person by id");
        System.out.println("4.To delete a person by id");
        System.out.println("0.To exit programme");
        System.out.println("Enter option");
        opt=scanner.nextInt();
        scanner.nextLine();
        switch (opt) {
            case 1 :
            if(count<max) {
             persons[count]=new person();
             persons[count].getdata(scanner);
            }
            else{
                System.out.println("Maximum limit has been reached");
            }
            
            break;
            case 2:
                for(int i=0;i<count;i++){
                    persons[i].display();
                }
            case 3:
                System.out.println("Enter ID to be searched");
                searchid=scanner.nextInt();
                boolean found=false;
             for(int i=0;i<count;i++){
                if(persons[i].getid()==searchid){
                    System.out.println("Person "+ (i+1)+":");
                    persons[i].display();
                    found=true;
                }
                break;
             }
                
            case 4:
                
              System.out.println("Enter ID to be deleted");
                searchid=scanner.nextInt();
                boolean find=false;
                
             for(int i=0;i<count;i++){
                if(persons[i].getid()==searchid){
                    persons[i].reset();
                    find=true;
                }
                break;

             }   

            default:
                System.out.println("enter valid option");
        }

        }
        
    }
}