import java.util.Scanner;

/**
 * Clase principal del sistema de gestión de empleados.
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        empleados.agregarEmpleado(new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000));
        empleados.agregarEmpleado(new Empleado("María García", Cargos.DISENADORA, 45000));
        empleados.agregarEmpleado(new Empleado("Pedro Sánchez", Cargos.GERENTE, 60000));

        Scanner scanner = new Scanner(System.in);
        double porcentaje = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(Constantes.MENSAJE_PORCENTAJE);
                String input = scanner.nextLine().trim().replace(",", "."); // Reemplazar coma por punto para decimales
                porcentaje = Double.parseDouble(input);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido para el porcentaje (use punto o coma para decimales).");
            }
        }

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}