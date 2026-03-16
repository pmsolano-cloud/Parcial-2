import java.util.ArrayList;

/**
 * Clase que gestiona una colección de empleados.
 */
public class Empleados {
    private ArrayList<Empleado> lista;

    /**
     * Constructor que inicializa la lista de empleados.
     */
    public Empleados() {
        lista = new ArrayList<>();
    }

    /**
     * Agrega un empleado a la lista.
     * @param empleado El empleado a agregar.
     */
    public void agregarEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje El porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra el listado de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Constantes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Obtiene la lista de empleados (para testing o acceso directo si necesario).
     * @return La lista de empleados.
     */
    public ArrayList<Empleado> getLista() {
        return lista;
    }
}