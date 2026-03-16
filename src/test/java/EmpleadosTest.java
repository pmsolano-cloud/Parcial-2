import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadosTest {

    @Test
    public void testAgregarEmpleado() {
        Empleados empleados = new Empleados();
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        empleados.agregarEmpleado(emp);
        // No hay getter, pero podemos verificar aumentando salario y ver si cambia
        empleados.aumentarSalario(10);
        assertEquals(55000, emp.getSalario(), 0.01);
    }

    @Test
    public void testAumentarSalario() {
        Empleados empleados = new Empleados();
        Empleado emp1 = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        Empleado emp2 = new Empleado("Ana Ruiz", Cargos.GERENTE, 60000);
        empleados.agregarEmpleado(emp1);
        empleados.agregarEmpleado(emp2);
        empleados.aumentarSalario(10);
        assertEquals(55000, emp1.getSalario(), 0.01);
        assertEquals(66000, emp2.getSalario(), 0.01);
    }

    @Test
    public void testAumentarSalarioCero() {
        Empleados empleados = new Empleados();
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        empleados.agregarEmpleado(emp);
        empleados.aumentarSalario(0);
        assertEquals(50000, emp.getSalario());
    }

    @Test
    public void testAumentarSalarioNegativo() {
        Empleados empleados = new Empleados();
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        empleados.agregarEmpleado(emp);
        empleados.aumentarSalario(-10);
        assertEquals(45000, emp.getSalario());
    }
}