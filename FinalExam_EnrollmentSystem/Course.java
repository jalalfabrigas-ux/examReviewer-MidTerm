package FinalExam_EnrollmentSystem;

public class Course {
    private String Coursecode;
    private String name;
    private int units;
    private int yearLevel;
    public Course(String Coursecode,String name,int units, int yearLevel){
        this.Coursecode=Coursecode;
        this.name=name;
        this.units=units;
        this.yearLevel=yearLevel;

    }   public String getCourseCode(){
    return Coursecode;
    }   public String getName(){
    return name;
    }   public int getUnits(){
    return units;
    }   public int yearLevel(){
    return yearLevel;
    }
}
