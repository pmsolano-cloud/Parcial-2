# Análisis de Caja Negra para la Clase Empleado

## Tabla 1: Análisis de Parámetros

| Parámetro | Tipo    | Descripción              | Criterios de Aceptación |
|-----------|---------|--------------------------|-------------------------|
| nombre    | String  | Nombre del empleado      | No vacío, contiene al menos un espacio (más de una palabra) |
| cargo     | Cargos  | Cargo del empleado       | Uno de los valores definidos en el enum Cargos |
| salario   | double  | Salario del empleado     | No negativo, >= 25000 (salario mínimo de convenio) |

## Tabla 2: Casos Válidos

| Caso | nombre              | cargo          | salario | Resultado Esperado                  |
|------|---------------------|----------------|---------|-------------------------------------|
| V1   | "Juan Pérez"        | DESARROLLADOR  | 50000   | Empleado creado correctamente       |
| V2   | "María García López"| DISENADORA     | 45000   | Empleado creado correctamente       |
| V3   | "Pedro Sánchez"     | GERENTE        | 60000   | Empleado creado correctamente       |
| V4   | "Ana Ruiz Martín"   | DESARROLLADOR  | 25000   | Empleado creado correctamente       |

## Tabla 3: Casos Inválidos

| Caso | nombre         | cargo         | salario | Resultado Esperado                          |
|------|----------------|----------------|---------|---------------------------------------------|
| I1   | ""             | DESARROLLADOR | 50000   | IllegalArgumentException: Nombre no válido  |
| I2   | "Juan"         | DESARROLLADOR | 50000   | IllegalArgumentException: Nombre no válido  |
| I3   | "Juan Pérez"   | null          | 50000   | IllegalArgumentException: Cargo no válido   |
| I4   | "Juan Pérez"   | DESARROLLADOR | -1000   | IllegalArgumentException: Salario no válido |
| I5   | "Juan Pérez"   | DESARROLLADOR | 20000   | IllegalArgumentException: Salario no válido |
| I6   | null           | DESARROLLADOR | 50000   | IllegalArgumentException (en constructor)       |
| I7   | null (setter)  | DESARROLLADOR | 50000   | IllegalArgumentException (en setNombre)         |

## Tabla 4: Casos para la Clase Empleados

| Caso | Descripción | Resultado Esperado |
|------|-------------|---------------------|
| E1   | Agregar empleado y aumentar salario 10% | Salario aumenta correctamente |
| E2   | Agregar múltiples empleados y aumentar salario | Todos los salarios aumentan |
| E3   | Aumentar salario 0% | Salarios sin cambio |
| E4   | Aumentar salario negativo | Salarios disminuyen |
| I6   | null           | DESARROLLADOR | 50000   | NullPointerException (en constructor)       |
| I7   | null (setter)  | DESARROLLADOR | 50000   | NullPointerException (en setNombre)         |