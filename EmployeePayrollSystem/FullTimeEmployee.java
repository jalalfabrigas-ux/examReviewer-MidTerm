yeapackage EmployeePayrollSystem;

public class FullTimeEmployee extends Employee{
    private int  overtimeHours;
    private String performance;

    public FullTimeEmployee(String name,double baseSalary,String performance,int overtimeHours){
        super(name,baseSalary);
        this.overtimeHours=overtimeHours;
        this.performance=performance;
    }
    @Override
    public double computeSalary(){
        double overtimePay = overtimeHours;
        double gross = getBaseSalary() + overtimePay;
        double bunosRate = 0;

        if(performance.equalsIgnoreCase("Excellent")){
            bunosRate =0.10;
        }else if(performance.equalsIgnoreCase("Good")){
            bunosRate = 0.05;
        }else if(performance.equalsIgnoreCase("Average")){
            bunosRate = 0.02;
        }else if(performance.equalsIgnoreCase("Poor")){
            bunosRate = 0;
        }
        double bunos = gross  * bunosRate;
        double totalSalary = gross + bunos;
        
        if(totalSalary < 0){
            return 0;
        }
        return totalSalary;
    }
}

//FULLTIME