package edu.sabana.poob.SabanaPayroll;

import edu.sabana.poob.SabanaPayroll.Department;

import java.util.ArrayList;
import java.util.UUID;

public class SabanaPayroll {

    private ArrayList<Department> departments;
    public SabanaPayroll() {
        this.departments = new ArrayList<>();
    }

    public double calculateDepartmentSalaries(UUID idDepartment){

        double DepartmentSalary = 0;
        for(Department d:this.departments){

            if (d.getId()==idDepartment){
                DepartmentSalary = d.calculateDepartmentSalaries();
            }
        }
        return DepartmentSalary;
    }

    public double calculateEmployeeSalary(UUID idEmployee){

        double EmploySalary = 0;
        for(Department d:this.departments){
            EmploySalary+=d.findSalaryEmployee(idEmployee);
        }
        return EmploySalary;
    }
    public double calculateUniversitySalaries(){

        double USalary = 0;
        for(Department d:this.departments){

            USalary += d.calculateDepartmentSalaries();
        }
        return USalary;
    }

    public void printPayroll(){

        for (Department d : this.departments)
        {
            System.out.println(d.printEmployes());
        }

    }

    public void addDeparment(Department department)
    {
        departments.add(department);
    }





}
