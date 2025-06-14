import java.util.ArrayList;
import java.util.Scanner;
public class Main{
static  Scanner scanner=new Scanner(System.in);
public static ArrayList<Student>student=new ArrayList<>();
public static ArrayList<Teacher>teacher=new ArrayList<>();
public static ArrayList<Course> course=new ArrayList<>();
public static ArrayList<Registeredcourse> registeredcourses=new ArrayList<>();
  public static void main(String[] args) {
    initialisecourses();
    initialisestudents();
    initialiseteachers();
      int opt=-1;
      while(opt!=0){
        System.out.println("1.Teacher");
        System.out.println("2.Student");
        System.out.println("3.Managing Department");
        System.out.println("0.To exit");

        System.out.println("Enter Option:");
        opt=scanner.nextInt();
         scanner.nextLine();
         if(opt == 1){
          System.out.println("1.To Enter Course Marks.");
          System.out.println("2.To view Course Marks.");
          System.out.println("Enter your choice:");
          int choice= scanner.nextInt();
          scanner.nextLine();
          switch (choice) {
              case 1 :
                  entermarks(scanner);
                  break;
              
              case 2:
                viewmarks();
                break;
              default:
                  System.out.println("INVALID OPTION!");
                  break;
          }
         }
         if (opt == 2){
         System.out.println("1.To view Offered Courses.");
         System.out.println("2.To Register/Add a Course.");
         System.out.println("3.To Drop a Course.");
         System.out.println("4.To View Registered courses.");
         System.out.println("5.To view Course Marks.");
          System.out.println("Enter your choice:");
          int choice= scanner.nextInt();
          scanner.nextLine();
          switch (choice) {
              case 1 :
                 displaycourses();
                  break;
              case 2:
                RegisterCourse();
                break;
              case 3:
                dropCourse();
                break;
              case 4:
                displayregisteredcourses();
                break;
              case 5:
                viewmarks();
                break;
              default:
                  System.out.println("INVALID CHOICE!");
                  break;
          }
         }
         if (opt == 3){
         System.out.println("1.To Add New Students.");
         System.out.println("2.To Add New Teachers."); 
          System.out.println("Enter your choice:");
          int choice= scanner.nextInt();
          scanner.nextLine();
          switch (choice) {
              case 1 :
                addStudent();        
                  break;
              case 2:
                addteachers();
                break;
              default:
                  System.out.println("INVALID CHOICE!");;
          }
         }
    
        
    }
    
  }
  public static void initialisestudents(){
    Student s1=new Student();
    s1.setname("Areej Fatima");
    s1.setid(25);
    s1.setemail("fa24-bse-025@cuilahore.pk");
    s1.setprogram("BSE");

    Student s2=new Student();
    s2.setname("Taha Umar");
    s2.setid(60);
    s2.setemail("fa24-bcs-060@cuilahore.pk");
    s2.setprogram("BCS");

    Student s3=new Student();
    s3.setname("Abdullah Minhas");
    s3.setid(43);
    s3.setemail("fa24-bse-043@cuilahore.pk");
    s3.setprogram("BSE");

   Student s4=new Student();
    s4.setname("Amna Kashif");
    s4.setid(104);
    s4.setemail("fa24-bse-104@cuilahore.pk");
    s4.setprogram("BSE"); 
    
    student.add(s1);
    student.add(s2);
    student.add(s3);
    student.add(s4);

  }
 public static void initialisecourses() {
    Course c1 = new Course();
    c1.setcourseid(101);
    c1.setcoursename("Programming Fundamentals");
    c1.setcredithours(3);

    Course c2 = new Course();
    c2.setcourseid(102);
    c2.setcoursename("Object Oriented Programming");
    c2.setcredithours(4);

    Course c3 = new Course();
    c3.setcourseid(103);
    c3.setcoursename("Data Structures and Algorithms");
    c3.setcredithours(3);

    Course c4 = new Course();
    c4.setcourseid(104);
    c4.setcoursename("Database Systems");
    c4.setcredithours(3);

    Course c5 = new Course();
    c5.setcourseid(105);
    c5.setcoursename("Operating Systems");
    c5.setcredithours(3);

    Course c6 = new Course();
    c6.setcourseid(106);
    c6.setcoursename("Computer Networks");
    c6.setcredithours(3);

    Course c7 = new Course();
    c7.setcourseid(107);
    c7.setcoursename("Software Engineering");
    c7.setcredithours(3);

    Course c8 = new Course();
    c8.setcourseid(108);
    c8.setcoursename("Artificial Intelligence");
    c8.setcredithours(3);

    Course c9 = new Course();
    c9.setcourseid(109);
    c9.setcoursename("Web Technologies");
    c9.setcredithours(3);

    Course c10 = new Course();
    c10.setcourseid(110);
    c10.setcoursename("Mobile App Development");
    c10.setcredithours(3);

    course.add(c1);
    course.add(c2);
    course.add(c3);
    course.add(c4);
    course.add(c5);
    course.add(c6);
    course.add(c7);
    course.add(c8);
    course.add(c9);
    course.add(c10);
}
public static void initialiseteachers() {
    Teacher t1 = new Teacher();
    t1.setname("Dr.Ahmed");
    t1.setid(201);
    t1.setemail("ahmed@uni.edu");
    t1.setDesignation("Professor");

    
    Teacher t2 = new Teacher();
    t2.setname("Dr Zara");
    t2.setid(202);
    t2.setemail("sana@uni.edu");
    t2.setDesignation("Lecturer");

    teacher.add(t1);
    teacher.add(t2);
}

public static void addStudent() {
    Student s = new Student();
    s.input(scanner); 
    System.out.print("Enter program: ");
    s.setprogram(scanner.nextLine());
    student.add(s);
    System.out.println("Student added successfully!");
}
public static void entermarks(Scanner scanner){
  System.out.println("Enter Student ID for marks to be entered:");
  int markid= scanner.nextInt();
  scanner.nextLine();
  Student markstudent= null;
  for(int i=0;i<student.size();i++){
    if(student.get(i).getid()== markid){
         markstudent=student.get(i);
         break;
    }
    
  }
  
   ArrayList<Registeredcourse> regcourses = markstudent.getRegisteredCourses();
   System.out.println("Enter course ID:");
   int cid= scanner.nextInt();
   for(int i=0;i<regcourses.size();i++){
       Registeredcourse regc= regcourses.get(i);
       if( regc.getCourse().getcourseid()== cid){
        System.out.println("Enter marks:");
        double marks=scanner.nextDouble();
        scanner.nextLine();
        regc.setmarks(marks);
        System.out.println("Marks entered successfully!");
       }
   }
   
}
public static void addteachers(){
   Teacher newteacher= new Teacher();
   newteacher.input(scanner);
   teacher.add(newteacher);
}
public static void displaycourses(){
  System.out.println("\n----------COURSES----------");
  for(int i=0;i<course.size();i++){
    course.get(i).display();
  }
  System.out.println("---------------------------");
}
public static void displaystudents(){
  System.out.println("\n----------STUDENTS----------");
  for(int i=0;i<student.size();i++){
    student.get(i).display();
  }
  System.out.println("---------------------------");
}
public static void displayteachers(){
  System.out.println("\n----------TEACHERS----------");
  for(int i=0;i<teacher.size();i++){
    teacher.get(i).display();
  }
  System.out.println("---------------------------");
}
public static void RegisterCourse(){
  System.out.println("Enter Student Id whose course is to be registered:");
  int sid=scanner.nextInt();
  Student selectedstudent=null;
  for(int i=0;i<student.size();i++){
    if(student.get(i).getid()== sid){
      selectedstudent=student.get(i);
    }
  }
  displaycourses();
  System.out.println("Enter number of courses to be registered");
  int num=scanner.nextInt();
  if (num>course.size() || num<=0){
    System.out.println("INVALID OPTION!");
  }
  else{
    for(int j=0;j<num;j++){
    System.out.println("Enter course ID to be registered:");
    int cid=scanner.nextInt();
    scanner.nextLine();
    Course selectedcourse=null;
    for(int k=0;k<course.size();k++){
    if(course.get(k).getcourseid() == cid){
       selectedcourse=course.get(k);
       break;
    }
    }
    if(selectedcourse== null){
      System.out.println("INVALID OPTION!");
    }
    boolean alreg=false;
for (Registeredcourse rc : selectedstudent.getRegisteredCourses()) {
            if (rc.getCourse().getcourseid() == cid) {
                alreg= true;
                break;
            }
        }

        if (alreg) {
            System.out.println("Course already registered.");
        } else {
            Registeredcourse newReg = new Registeredcourse(selectedcourse);
            newReg.setudentid(sid);
           selectedstudent.getRegisteredCourses().add(newReg);
            registeredcourses.add(newReg); 
            System.out.println("Course registered successfully!");
    
    }
  }

}
}
public static void dropCourse() {
    System.out.println("Enter Student ID to drop a course:");
    int sid = scanner.nextInt();
    scanner.nextLine();
    Student selectedStudent = null;
    for (int i = 0; i < student.size(); i++) {
        if (student.get(i).getid() == sid) {
            selectedStudent = student.get(i);
            break;
        }
    }
    if (selectedStudent == null) {
        System.out.println("Student not found!");
        return;
    }
    ArrayList<Registeredcourse> regCourses = selectedStudent.getRegisteredCourses();

    if (regCourses.isEmpty()) {
        System.out.println("This student is not registered in any courses.");
        return;
    }
    System.out.println("Registered courses for this student:");
    displayregisteredcourses();
    System.out.println("Enter Course ID to drop:");
    int cid = scanner.nextInt();
    scanner.nextLine();

    Registeredcourse toRemove = null;

    for (int i = 0; i < regCourses.size(); i++) {
        if (regCourses.get(i).getCourse().getcourseid() == cid) {
            toRemove = regCourses.get(i);
            break;
        }
    }

    if (toRemove == null) {
        System.out.println("Course not found in this student's registrations.");
    } else {
        regCourses.remove(toRemove); 
        registeredcourses.remove(toRemove);
        System.out.println("Course dropped successfully!");
    }
}
public static void displayregisteredcourses() {
  displaystudents();
    System.out.println("Enter Student ID to view registered courses:");
    int sid = scanner.nextInt();
    scanner.nextLine();

    boolean found = false;
    for (int i = 0; i < registeredcourses.size(); i++) {
        Registeredcourse rc = registeredcourses.get(i);
        if (rc.getstudentid() == sid) {
            rc.getCourse().display();  
            found = true;
        }
    }
    if (!found) {
        System.out.println("No registered courses found for this student.");
    }
}
public static void viewmarks(){
  displaystudents();
  System.out.println("Enter Student Id");
  int searchid=scanner.nextInt();
  double totalmarks=0;
  int totalcourses=0;
  double totalgpa=0;
  int totalhrs=0;
  displayregisteredcourses();
  boolean found =false;
  for(int i=0;i<registeredcourses.size();i++){
  Registeredcourse regid= registeredcourses.get(i);
  if(regid.getstudentid()== searchid){
    found=true;
      double m = regid.getmarks();
            Course c = regid.getCourse();
            System.out.printf("%-25s : %.2f%n", c.getcoursename(), m);

            totalmarks += m;
            totalcourses++;
            totalgpa += getgpa(m) * c.getcredithours();
            totalhrs += c.getcredithours();
        
   }
   if(!found){
    System.out.println("Not Found!");
    return;
   }
  }
   System.out.printf("Average Marks : %.2f%%%n", totalmarks / totalcourses);
    System.out.printf("CGPA          : %.2f%n", totalgpa / totalhrs);
}
public static double getgpa(double marks){
  if(marks > 90.0)
			return 4.0;
		if(marks <= 90.0 && marks > 80.0)
			return 3.5;
		if(marks <= 80.0 && marks > 70.0)
			return 3.0;
		if(marks <= 70.0 && marks > 60.0)
			return 2.5;
		if(marks <= 60.0 && marks > 50.0)
			return 2.0;
		return 0.0;
}

}