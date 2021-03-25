package edu.sabana.poob.SabanaPayroll;

import edu.sabana.poob.SabanaPayroll.Department;

import java.util.UUID;

public class Employee {

    private UUID id;
    private String name;
    private String lastname;
    private Department department;

    public Employee(String name, String lastname, Department department) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastname = lastname;
        this.department = department;
    }

    public double calculateSalary(){return 0;}

    @Override
    public String toString() {
        return String.format("%s %s, department %s, salary %s", this.name, this.lastname, this.department.getName(), this.calculateSalary());
    }

    public String getName(){return name;}

    public String getLastname() {
        return lastname;
    }

    public UUID getId() {
        return id;
    }
}
