import java.util.Scanner;

public class report{
 static  Scanner scanner = new Scanner(System.in);
 static final int max=10;
 static Person[]persons=new Person[max];
 public static int count=0;

 public static void createperson(){
       System.out.println("Enter number of person to be created:");
       int num= scanner.nextInt();  
       scanner.nextLine();
        if(count+num<=max){
            for( int i=0;i<num;i++){
                System.out.println("Enter data for person number"+(i+1));
           Person p = new Person();
            p.input(scanner);
            
            persons[count++] = p;
            }
        }
        else{
            System.out.println("Maximum limit has been exceded.");
        }

}
public static void viewperson(){
    for(int i=0;i<count;i++){
        persons[i].display();
    }
}
public static void editperson(){
System.out.println("Enter id of person to be edited:");
int id= scanner.nextInt();
for(int i=0;i<count;i++){
    if(persons[i].getid()==id){
        int choice=0;
        System.out.println("Press 1 to edit name.");
        System.out.println("Press 2 to edit address. ");
        System.out.println("Press 3 to edit DOB. ");
        System.out.println("Enter option:");
        choice=scanner.nextInt();
        if(choice ==1){
         System.out.println("Enter new name:");
         String newname= scanner.nextLine();
         persons[i].setName(newname);
        }
        if (choice ==2){
            int option =0;
           System.out.println("Enter new address:");
           System.out.println("Press 1 to edit housenumber:");
           System.out.println("Press 2 to edit society:");
           System.out.println("Press 3 to edit city:");
           System.out.println("Enter option:");
           option=scanner.nextInt();
           if(option ==1){
            System.out.println("Enter new nouse number:");
            int newhousenum=scanner.nextInt();
            persons[i].getaddress().sethousenumber(newhousenum);
           }
           if (option ==2){
            System.out.println("Enter new society:");
            String newsociety=scanner.nextLine();
            persons[i].getaddress().setsociety(newsociety);
           }
           if(option ==3){
            System.out.println("Enter new city");
            String newcity=scanner.nextLine();
            persons[i].getaddress().setcity(newcity);
           }

        }
        if (choice == 3){
            int opts=0;
            System.out.println("Enter new DOB:");
            System.out.println("Press 1 to edit date");
            System.out.println("Press 2 to edit month");
            System.out.println("Press 3 to edit year");
            System.out.println("Enter option:");
            opts=scanner.nextInt();
            scanner.nextLine();
            if(opts==1){
                System.out.println("Enter new date");
               int newdate=scanner.nextInt();
               persons[i].getdob().setdate(newdate);
            }
            if(opts == 2){
                System.out.println("Enter new month:");
                String newmonth=scanner.nextLine();
                persons[i].getdob().setmonth(newmonth);
            }
            if(opts == 3){
                System.out.println("Enter new year:");
                int newyear=scanner.nextInt();
                persons[i].getdob().setyear(newyear);
            }

        }
    }
}
}
public static void  reset( ){
    count=0;
}
public static void searchbymonth(){
    System.out.print("Enter birth month to search: ");
        String month = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (persons[i].getdob().getmonth().equals(month)) {
                persons[i].display();
            }
        }

}
public static void searchbycity(){
    System.out.println("Enter city to be searched:");
    String city= scanner.nextLine();
    for(int i=0;i<count;i++){
        if(persons[i].getaddress().getcity().equals(city)){
        persons[i].display();
        }
    }

}

 public static void main(String[] args) {
        int opt=-1;
          while(opt !=0){
        System.out.println("1.Create a person");
        System.out.println("2.View person");
        System.out.println("3.edit a person");
        System.out.println("4.Delete a person");
        System.out.println("5.Search a person by city");
        System.out.println("6.Search a person by birth month.");
        System.out.println("0.End programme");
        System.out.println("Enter option:");
        opt=scanner.nextInt();
        scanner.nextLine();
        switch(opt){
            case 1:
              createperson();
              break;
            case 2:
                viewperson();
                break;
            case 3:
                editperson();
                break;
            case 4:
                reset();
                break;
            case 5:
                searchbycity();
                break;
            case 6:
                searchbymonth();
                break;
            default:
                System.out.println("Invalid option");
         }

      }


    }
} 
