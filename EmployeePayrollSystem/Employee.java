package EmployeePayrollSystem;

public class Employee{
    private String name;
    private double baseSalary;

    public Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }   public String getName(){
        return name;
    }   public double getBaseSalary(){
        return baseSalary;
    }   public void setName(String name){
        this.name=name;
    }   public void setBaseSalary(double baseSalary){
        if(baseSalary <= 0){
            this.baseSalary=0;
        }else{
            this.baseSalary=baseSalary;
        }
    }   public double computeSalary(){
        return baseSalary;
    }
}