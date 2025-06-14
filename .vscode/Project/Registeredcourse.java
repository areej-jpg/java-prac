public class Registeredcourse extends Course{
    private int studentid;
    private int teacherid;
    private double marks;
    private Course course;
    public Registeredcourse(){
        studentid=0;
        teacherid=0;
        marks=-1;
    }
    public int getstudentid(){
        return studentid;
    }
    public void setudentid(int studentid){
        this.studentid=studentid;
    }
    public Registeredcourse(Course course) {
        this.course = course;
        this.marks = -1; 
    }

    public Course getCourse() {
        return course;
    }
    public void setmarks(double marks){
       this.marks=marks;
    }
    public double getmarks(){
        return marks;
    }
    public void display() {
        course.display();
        System.out.println("Marks: " + (marks == -1 ? "Not Assigned" : marks));
        System.out.println("______________________________");
    }
   
}