import java.util.Scanner;
 public class DOO{
    private int day;
    private String month;
    private int year;
    public DOO(){
        day=0;
        month="";
        year=0;
    }      
     public DOO(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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
    public int getDay() { 
        return day;
    }
    public int getYear() { 
       return year; 
    }


}