# Sistema de Gestión de Empleados

## Información General
Este proyecto es un sistema simple de gestión de empleados desarrollado en Java. Permite crear empleados con validaciones, gestionar una lista de empleados, aumentar salarios y mostrar información. Está diseñado como un ejemplo educativo para demostrar conceptos de POO, validación de datos y testing con JUnit.

## Autoría
- Autor: Pablo Manuel Solano Salinas
- Institución: Universidad Católica San Antonio
- Fecha: Marzo 2026
- Versión: 1.0.0

## Estructura del Proyecto
```
Empleado/
├── src/
│   ├── main/java/
│   │   ├── Cargos.java          # Enum de cargos profesionales
│   │   ├── Constantes.java      # Constantes del sistema
│   │   ├── Empleado.java        # Clase Empleado
│   │   ├── Empleados.java       # Gestión de colección de empleados
│   │   └── SistemaGestionEmpleados.java  # Clase principal
│   └── test/java/
│       └── EmpleadoTest.java    # Tests unitarios
├── lib/
│   └── junit-platform-console-standalone-1.10.0.jar  # Biblioteca JUnit
├── bin/                         # Archivos compilados (generado)
├── .classpath                   # Configuración de classpath para IDE
├── README.md                    # Este archivo
└── TESTING.md                   # Documentación de testing
```

## Explicación del Código

### Clases Principales
- **Empleado.java**: Representa a un empleado con atributos nombre, cargo y salario. Incluye validaciones estrictas:
  - Nombre: Debe tener al menos dos palabras, no vacío.
  - Cargo: Debe ser uno de los valores del enum Cargos.
  - Salario: Debe ser >= 25000 (salario mínimo definido en Constantes).
  
- **Empleados.java**: Gestiona una colección de empleados usando ArrayList. Métodos principales:
  - `agregarEmpleado(Empleado)`: Agrega un empleado a la lista.
  - `aumentarSalarios(double porcentaje)`: Aumenta el salario de todos los empleados en un porcentaje.
  - `mostrarEmpleados()`: Imprime la lista de empleados.

- **Cargos.java**: Enum que define los cargos válidos: DESARROLLADOR, GERENTE, ANALISTA.

- **Constantes.java**: Contiene constantes como SALARIO_MINIMO (30000) y textos fijos.

- **SistemaGestionEmpleados.java**: Punto de entrada del programa. Crea empleados de ejemplo, los agrega a la lista, aumenta salarios y muestra resultados.

### Validaciones y Manejo de Errores
El código incluye validaciones en constructores y setters que lanzan `IllegalArgumentException` para datos inválidos, siguiendo buenas prácticas de programación defensiva.

## Tests
Los tests están implementados en `EmpleadoTest.java` usando JUnit 5. Cubren:
- Casos válidos de construcción y modificación.
- Casos inválidos: nombres vacíos/cortos, cargos null, salarios negativos/bajos.
- Total: 12 tests unitarios.

### Cómo Ejecutar los Tests
1. **Compilar el código**:
   ```
   javac -d bin src/main/java/*.java
   javac -cp "bin;lib/junit-platform-console-standalone-1.10.0.jar" -d bin src/test/java/*.java
   ```

2. **Ejecutar los tests**:
   ```
   java -jar lib/junit-platform-console-standalone-1.10.0.jar --class-path bin --scan-classpath
   ```

3. **En VS Code**: Con la extensión Java instalada, los tests se pueden ejecutar desde el Test Explorer (Ctrl+Shift+P > "Test: Run All Tests").

Consulta `TESTING.md` para un análisis detallado de caja negra y casos de prueba.

## Requisitos
- Java 11 o superior (probado con JDK 24).
- JUnit 5 (incluido en `lib/`).

## Cómo Ejecutar el Programa
1. Compilar: `javac -d bin src/main/java/*.java`
2. Ejecutar: `java -cp bin SistemaGestionEmpleados`

## Notas
- El proyecto usa una estructura de carpetas estándar para proyectos Java.
- Las bibliotecas JUnit se incluyen manualmente para evitar dependencias externas complejas.
- Todos los tests pasan exitosamente, confirmando la robustez del código.

