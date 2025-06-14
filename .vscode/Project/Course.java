import java.util.Scanner;
public class Course{
 private int courseid;
 private String coursename;
 private int credithours;
 private int depid;
 private int semester;
 public Course(){
    courseid=0;
    coursename="";
    credithours=0;
    depid=0;
    semester=0;
 }
  public void input(Scanner scanner){
   System.out.println("Enter course ID:");
   courseid=scanner.nextInt();
   scanner.nextLine();
   System.out.println("Enter course name:");
   coursename=scanner.nextLine();
   System.out.println("Enter credit hours:");
   credithours=scanner.nextInt();
   scanner.nextLine();
   System.out.println("Enter department ID:");
   depid=scanner.nextInt();
   scanner.nextLine();
   System.out.println("Enter semester number:");
   semester=scanner.nextInt();
   scanner.nextLine();
  }
  public void display(){
   System.out.println("Course ID:"+ courseid);
   System.out.println("Course name:"+ coursename);
   System.out.println("Credit Hours:"+ credithours);
   System.out.println("Department ID:"+ depid);
   System.out.println("Semester:"+ semester);
  }
   
 public void setcourseid(int courseid){
    this.courseid=courseid;
 }
 public void setcoursename(String coursename){
    this.coursename=coursename;
 }
 public void setcredithours(int credithours){
    this.credithours=credithours;
 }
 public int getcourseid(){
    return courseid;
 }
 public String getcoursename(){
    return coursename;
 }
 public int getcredithours(){
    return credithours;
 }
}