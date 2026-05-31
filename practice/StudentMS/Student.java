package practice.StudentMS;

public class Student extends Person{
    private int studentID;
    private String course;
    public Student(String name, int age, int studentID, String course){
        super(name,age);
        this.studentID=studentID;
        this.course=course;

    } public int getStudentID(){
        return studentID;

    }  public void setStudentID(int studentID){
        this.studentID=studentID;
    }  public String getCourse(){
        return course;
    }   public void setCourse(String course){
        this.course=course;
    } 
    @Override
    public void displayInfo(){
    }
}
