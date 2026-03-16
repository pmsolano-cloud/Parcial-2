/**
 * Enum que define los cargos profesionales válidos en la empresa.
 */
public enum Cargos {
    DESARROLLADOR("Desarrollador"),
    DISENADORA("Diseñadora"),
    GERENTE("Gerente");

    private final String displayName;

    Cargos(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}