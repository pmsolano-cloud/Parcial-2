import java.util.Objects;

/**
 * Clase que representa a un empleado con nombre, cargo y salario.
 */
public class Empleado {
    private String nombre;
    private Cargos cargo;
    private double salario;

    /**
     * Constructor de Empleado.
     * @param nombre El nombre del empleado (no vacío, al menos dos palabras).
     * @param cargo El cargo del empleado (debe ser uno de los definidos en Cargos).
     * @param salario El salario del empleado (no negativo, >= SALARIO_MINIMO).
     * @throws IllegalArgumentException si algún parámetro no cumple los criterios.
     */
    public Empleado(String nombre, Cargos cargo, double salario) {
        setNombre(nombre);
        setCargo(cargo);
        setSalario(salario);
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre El nuevo nombre (no vacío, al menos dos palabras).
     * @throws IllegalArgumentException si no válido.
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty() || !nombre.contains(" ")) {
            throw new IllegalArgumentException("Nombre no válido: debe ser no vacío y contener al menos un espacio.");
        }
        this.nombre = nombre.trim();
    }

    /**
     * Obtiene el cargo del empleado.
     * @return El cargo.
     */
    public Cargos getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     * @param cargo El nuevo cargo (debe ser uno de Cargos).
     * @throws IllegalArgumentException si no válido.
     */
    public void setCargo(Cargos cargo) {
        if (cargo == null) {
            throw new IllegalArgumentException("Cargo no válido.");
        }
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario del empleado.
     * @return El salario.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * @param salario El nuevo salario (no negativo, >= SALARIO_MINIMO).
     * @throws IllegalArgumentException si no válido.
     */
    public void setSalario(double salario) {
        if (salario < 0 || salario < Constantes.SALARIO_MINIMO) {
            throw new IllegalArgumentException("Salario no válido: debe ser no negativo y >= " + Constantes.SALARIO_MINIMO);
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.salario, salario) == 0 &&
                Objects.equals(nombre, empleado.nombre) &&
                cargo == empleado.cargo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cargo, salario);
    }
}