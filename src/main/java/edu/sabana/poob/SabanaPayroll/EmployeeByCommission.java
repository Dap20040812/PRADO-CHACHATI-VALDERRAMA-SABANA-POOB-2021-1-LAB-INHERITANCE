package edu.sabana.poob.SabanaPayroll;

public class EmployeeByCommission extends Employee {

    private static final double VALOR_COMISION = 3.5;
    private double productos_vendidos;

    public EmployeeByCommission(String name, String lastname, Department department, double productos_vendidos) {
        super(name, lastname, department);
        this.productos_vendidos = productos_vendidos;
    }

    @Override
    public double calculateSalary(){
        return this.productos_vendidos*EmployeeByCommission.VALOR_COMISION;
    }

    @Override

    public String toString() {return super.toString()+" payment by commission";}
}
