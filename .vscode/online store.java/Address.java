import java.util.Scanner;
public class Address{
    private int housenum;
    private String society;
    private String city;

    public Address(){
        housenum=0;
        society="";
        city="";
    }
    public void input(Scanner scanner){
        System.out.println("Enter house number:");
        housenum=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Area:");
        society=scanner.nextLine();
        System.out.println("Enter City:");
        city=scanner.nextLine();

    }
    public void dsiplay(){
       System.out.println("House number:"+ housenum); 
       System.out.println("Area:"+ society);
       System.out.println("City:"+ city);
    }
    public String getcity(){
        return city;
    }
    public void sethousenumber( int housenum){
      this.housenum=housenum;
    }
    public void setsociety(String society){
        this.society=society;
    }
    public void setcity(String city){
     this.city=city;
    }
}