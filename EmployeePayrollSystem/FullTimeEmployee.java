package EmployeePayrollSystem;

public class FullTimeEmployee extends Employee{
    private int  overtimeHours;
    private String performance;

    public FullTimeEmployee(String name,double baseSalary,String performance,int overtimeHours){
        super(name,baseSalary);
        this.overtimeHours=overtimeHours;
        this.performance=performance;
    }
}