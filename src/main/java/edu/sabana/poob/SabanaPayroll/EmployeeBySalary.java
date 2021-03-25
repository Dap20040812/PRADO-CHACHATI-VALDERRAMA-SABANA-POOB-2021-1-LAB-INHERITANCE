package edu.sabana.poob.SabanaPayroll;

public class EmployeeBySalary extends Employee {

    private static final double HEALTH_DISCOUNT = 0.04;
    private static final double SOCIAL_EQUITY_DISCOUNT = 0.04;
    private double salary;

    public EmployeeBySalary(String name, String lastname, Department department, double salary) {
        super(name, lastname, department);
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return this.salary*(1-(EmployeeBySalary.HEALTH_DISCOUNT+EmployeeBySalary.SOCIAL_EQUITY_DISCOUNT));
    }

    @Override

    public String toString() {return super.toString()+" payment by salary";}
}
