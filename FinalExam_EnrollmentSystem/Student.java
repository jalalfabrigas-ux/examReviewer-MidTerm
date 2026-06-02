package FinalExam_EnrollmentSystem;

public abstract class Student {
    private String name;
    private String id;
    private double gpa;
    private int yearLevel;
    private Course[] courses = new Course[20];
    private int courseCount = 0;

    public Student(String name, String id, double gpa, int yearLevel){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
        this.yearLevel=yearLevel;
    }  public String getName(){
        return name;
    }  public void setName(String name){
        this.name=name;
    }  public String getID(){
        return id;
    }  public void setID(String id){
        this.id=id;
    }   public double getGPA(){
        return gpa;
    }   public void setGPA(double gpa){
        this.gpa=gpa;
    }   public int getYearLevel(){
        return yearLevel;
    }   public void setYearLevel(int yearLevel){
        this.yearLevel=yearLevel;
    }
    
}
