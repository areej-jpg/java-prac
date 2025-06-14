 import java.util.Scanner;
 public class DOB{
    private int day;
    private String month;
    private int year;
    public DOB(){
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
