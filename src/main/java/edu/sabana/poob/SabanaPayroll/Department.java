package edu.sabana.poob.SabanaPayroll;

import java.util.ArrayList;
import java.util.UUID;

public class Department{

    private String name;
    private UUID id;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.employees = new ArrayList<>();
    }

    public String getName(){return name;}

    public UUID getId() {
        return id;
    }

    public double calculateDepartmentSalaries() {

        double Totalsalary = 0;
        for(Employee e: this.employees){

            Totalsalary += e.calculateSalary();
        }

        return Totalsalary;
    }

    public double findSalaryEmployee(UUID idEmployee) {
        double EmployeeSalary=0;
        for(Employee e: this.employees){
            if(e.getId()==idEmployee){
                EmployeeSalary = e.calculateSalary();
                break;
            }
        }
        return EmployeeSalary;
    }

    public ArrayList<String> printEmployes() {

        ArrayList<String> employees = new ArrayList<>();
        for (Employee e: this.employees)
        {
            employees.add(e.toString());
        }

        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
