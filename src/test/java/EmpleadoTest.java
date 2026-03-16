import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void testConstructorValido() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        assertEquals("Juan Pérez", emp.getNombre());
        assertEquals(Cargos.DESARROLLADOR, emp.getCargo());
        assertEquals(50000, emp.getSalario());
    }

    @Test
    public void testNombreInvalidoVacio() {
        assertThrows(IllegalArgumentException.class, () -> new Empleado("", Cargos.DESARROLLADOR, 50000));
    }

    @Test
    public void testNombreInvalidoUnaPalabra() {
        assertThrows(IllegalArgumentException.class, () -> new Empleado("Juan", Cargos.DESARROLLADOR, 50000));
    }

    @Test
    public void testCargoInvalidoNull() {
        assertThrows(IllegalArgumentException.class, () -> new Empleado("Juan Pérez", null, 50000));
    }

    @Test
    public void testSalarioInvalidoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Empleado("Juan Pérez", Cargos.DESARROLLADOR, -1000));
    }

    @Test
    public void testSalarioInvalidoBajoMinimo() {
        assertThrows(IllegalArgumentException.class, () -> new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 20000));
    }

    @Test
    public void testSetNombreValido() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        emp.setNombre("Ana Ruiz");
        assertEquals("Ana Ruiz", emp.getNombre());
    }

    @Test
    public void testSetNombreInvalido() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        assertThrows(IllegalArgumentException.class, () -> emp.setNombre("Ana"));
    }

    @Test
    public void testSetCargoValido() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        emp.setCargo(Cargos.GERENTE);
        assertEquals(Cargos.GERENTE, emp.getCargo());
    }

    @Test
    public void testSetSalarioValido() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        emp.setSalario(55000);
        assertEquals(55000, emp.getSalario());
    }

    @Test
    public void testSetSalarioInvalido() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        assertThrows(IllegalArgumentException.class, () -> emp.setSalario(20000));
    }

    @Test
    public void testConstructorNombreNull() {
        assertThrows(IllegalArgumentException.class, () -> new Empleado(null, Cargos.DESARROLLADOR, 50000));
    }

    @Test
    public void testSetNombreNull() {
        Empleado emp = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        assertThrows(IllegalArgumentException.class, () -> emp.setNombre(null));
    }

    @Test
    public void testEquals() {
        Empleado emp1 = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        Empleado emp2 = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        assertEquals(emp1, emp2);
    }

    @Test
    public void testEqualsDifferent() {
        Empleado emp1 = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        Empleado emp2 = new Empleado("Ana Ruiz", Cargos.DESARROLLADOR, 50000);
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void testHashCode() {
        Empleado emp1 = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        Empleado emp2 = new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000);
        assertEquals(emp1.hashCode(), emp2.hashCode());
    }
}