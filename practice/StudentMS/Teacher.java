package practice.StudentMS;

public class Teacher extends Person{
    private int employeeID;
    private String subject;
    public Teacher(String name, int age, int employeeID, String subject){
        super(name,age);
        this.employeeID=employeeID;
        this.subject=subject;
    }   public int getEmployeeID(){
        return employeeID;
    }   public void setEmployeeID(int employeeID){
        this.employeeID=employeeID;
    }   public String getSubject(){
        return subject;
    }   public void setSubject(String subject){
        this.subject=subject;
    }
    @Override
    public void displayInfo(){
        
    }
}
