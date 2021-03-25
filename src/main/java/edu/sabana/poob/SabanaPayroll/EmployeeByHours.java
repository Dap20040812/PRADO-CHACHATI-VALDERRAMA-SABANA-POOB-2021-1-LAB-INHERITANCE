package edu.sabana.poob.SabanaPayroll;

public class EmployeeByHours extends Employee {

    public final static double VALOR_HORA = 3.5;
    private double horas_trabajadas;

    public EmployeeByHours(String name, String lastname, Department department, double horas_trabajadas) {
        super(name, lastname, department);
        this.horas_trabajadas = horas_trabajadas;
    }

    @Override
    public double calculateSalary(){
        return this.horas_trabajadas*EmployeeByHours.VALOR_HORA;
    }

    @Override

    public String toString() {return super.toString()+" payment by hours";}
}

