# Modelado Avanzado de Clases: Requerimientos, Diagramas UML y Programación en Java (120 minutos)

💡 **Modalidad**: Simulación guiada con IA + Ejercicio práctico completo

---

## 🟣 Fase 1 – Simulación de Requerimientos (30 minutos)

### Objetivo:
Practicar el levantamiento de requerimientos entrevistando a un cliente (IA).

### 👽 Prompt inicial para ChatGPT u otra IA (para estudiantes):

> "Actuarás como un cliente que desea un sistema informático para su negocio. Yo seré un programador que debe hacerte preguntas para entender bien lo que necesitas. Por favor, responde como lo haría un cliente real: sin términos técnicos, con necesidades prácticas, y a medida que yo pregunto. Necesito identificar las entidades principales, sus relaciones y funcionalidades. Empezamos ahora."

### ✅ Dinámica:

- El estudiante actúa como programador, la IA como cliente.
- Se realiza un diálogo en tiempo real donde el estudiante:
  - Identifica entidades clave (clases).
  - Detecta atributos relevantes.
  - Reconoce relaciones entre clases (herencia, composición, agregación).
- 🦊 El estudiante anota la información pertinente acerca de clases y relaciones.

---

## 🔷 Fase 2 – Diseño de Diagramas UML (35 minutos)

### Objetivo:
Traducir los requerimientos a un diseño orientado a objetos visual.

### 📐 Actividades:

- Crear el diagrama de clases usando:
  - [Editor PlantUML Online](https://www.plantuml.com/plantuml/uml/SyfFKj2rKt3CoKnELR1Io4ZDoSa70000)
  - O herramientas visuales como Lucidchart o Draw.io.

### 🔧 Instrucciones básicas para usar PlantUML:


@startuml
class Libro {
  - titulo : String
  - autor : String
  - disponible : boolean
  + prestar() : void
  + devolver() : void
}

class Estudiante {
  - nombre : String
  - id : String
}

class Prestamo {
  - fechaInicio : Date
  - fechaDevolucion : Date
}

Prestamo *-- Libro : incluye
Prestamo *-- Estudiante : pertenece a
@enduml


🤖🤖 Define relaciones con flechas:

***-- para composición
o-- para agregación
--|> para herencia**

---
## 🟢 Fase 3 – Programación en Java (40 minutos)

### Objetivo:
Implementar el diseño en código de manera sencilla y clara.

### 💻 Actividades:

- El estudiante implementa las clases principales con:
  - Atributos
  - Constructores
  - Métodos getters/setters
  - Relaciones entre clases representadas mediante atributos (composición o agregación)

### 💡 Tips para representar relaciones en Java:

- **Composición**: el objeto contenido se crea dentro de la clase contenedora. Se usa cuando la existencia de un objeto depende completamente del otro.

  ```java
  public class Pedido {
      private Factura factura;

      public Pedido() {
          this.factura = new Factura(); // Composición: Pedido crea su Factura
      }
  }
  ```

- **Agregación**: el objeto se pasa como parámetro o se recibe externamente. Se usa cuando el objeto puede existir de forma independiente.

  ```java
  public class Restaurante {
      private Chef chef;

    public Restaurante(Chef chef) {
        this.chef = chef; // Agregación: el Chef es independiente del Restaurante
    }
  }

  
## 🔚 Fase 4 – Cierre y reflexión (15 minutos)

### Objetivo:
Consolidar aprendizajes y reforzar los conceptos adquiridos durante la clase.

### 📌 Preguntas guía para la reflexión:

- ¿Qué parte del levantamiento de requerimientos fue más difícil?
- ¿Cómo impactan las decisiones de modelado en el diseño del código?
- ¿Qué errores cometiste durante la construcción del sistema y cómo los corregiste?
- ¿Qué ventajas encontraste al trabajar primero con diagramas antes de programar?

---

## 🏁 Productos esperados

### 👾 Resumen de requerimientos:
- Claramente levantados a través de la entrevista simulada con la IA.
- Identificación de clases, relaciones y funcionalidades clave del sistema.

### 🤩 Diagrama de clases UML bien estructurado:
- Clases principales correctamente nombradas.
- Inclusión de atributos y métodos relevantes.
- Relaciones representadas gráficamente:
  - **Composición** (dependencia total)
  - **Agregación** (dependencia parcial)
  - **Herencia** (jerarquías o especializaciones)

### 👽 Código Java funcional:
- Declaración de clases con sus atributos y constructores.
- Métodos `getters` y `setters` implementados adecuadamente.
- Relaciones aplicadas correctamente entre las clases.
- Método `main()` que demuestre la creación e interacción de los objetos modelados.
