package edu.sabana.poob.SabanaNominaTest;

import edu.sabana.poob.SabanaPayroll.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SabanaNominaTest {
    private static EmployeeBySalary e1;
    private static EmployeeByHours e2;
    private static EmployeeByCommission e3;


    @BeforeAll
    public static void setUp(){

        SabanaPayroll s = new SabanaPayroll();
        Department d = new Department("D");
        Department d1 = new Department("D1");
        s.addDeparment(d);
        s.addDeparment(d1);
        e1 = new EmployeeBySalary("E","R",d,120);
        e2 = new EmployeeByHours("R","T",d1,5);
        e3 = new EmployeeByCommission("T","Y",d,6);
        d.addEmployee(e1);
        d.addEmployee(e3);
        d1.addEmployee(e2);
    }

    @Test
    public void ShouldPrintEmployees(){

        assertEquals("E R, department D, salary 110.4 payment by salary" ,e1.toString());
        assertEquals("R T, department D1, salary 17.5 payment by hours" ,e2.toString());
        assertEquals("T Y, department D, salary 21.0 payment by commission" ,e3.toString());
    }
}
