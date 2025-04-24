# Programación Orientada a Objetos en Java: Clases Abstractas y Polimorfismo

##  Apartado Teórico

En Java, una **clase abstracta** es una clase que no puede instanciarse directamente y que suele contener uno o más métodos abstractos, es decir, métodos que no están implementados. Sirve como base para otras clases que la extienden, obligando a dichas clases a implementar los métodos abstractos.

###  Sintaxis de una clase abstracta:

```java
abstract class Contenido {
    String autor;
    int likes;

    public Contenido(String autor) {
        this.autor = autor;
        this.likes = 0;
    }

    public abstract void reproducir();
}
```

###  Polimorfismo

El **polimorfismo** permite que una misma referencia (de tipo clase abstracta o interfaz) pueda apuntar a objetos de distintas subclases. Así, podemos ejecutar comportamientos distintos usando una única interfaz común.

Ejemplo del uso de polimorfismo:

```java
Contenido c = new Live();
c.reproducir(); // Ejecuta la versión de Live

c = new Video();
c.reproducir(); // Ejecuta la versión de Video
```

## Código Base

Se dispone de la siguiente jerarquía de clases:

- `Contenido` (abstracta)
- `Live` (extiende `Contenido`)
- `Video` (extiende `Contenido`)
- `App` (contiene el método `main`)

> **Nota:**  
> Cada subclase que extienda de `Contenido` debe incluir un **constructor** que reciba el nombre del autor como parámetro y lo pase al constructor de la superclase utilizando `super(autor);`.  
> Esto asegura que el atributo `autor` se inicialice correctamente al crear una instancia de cualquier clase que herede de `Contenido`.

### 🧱 Ejemplo: Clase `Live` con constructor

```java
public class Live extends Contenido {
    String anfitrion;

    public Live(String autor, String anfitrion) {
        super(autor); // Llama al constructor de la clase Contenido
        this.anfitrion = anfitrion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo live de " + autor + " con anfitrión " + anfitrion);
    }
}
```

---

## 📘 Ejercicios

A continuación, se presentan ejercicios de dificultad progresiva. Cada uno te invita a modificar o ampliar el código base:

### 🟢 Ejercicio 1: Corregir Errores

Corrige los siguientes errores en el código:

- Agrega constructores adecuados a las clases `Live` y `Video` para que puedan inicializar los atributos heredados.
- Elimina o corrige la línea inválida: `Live live = new Contenido();`.

### 🟡 Ejercicio 2: Añadir Comportamiento

Agrega el método `darLike()` a la clase `Contenido` que aumente en uno el número de likes y luego imprima el total de likes. Prueba este método desde el `main`.

### 🟠 Ejercicio 3: Añadir una Nueva Subclase

Crea una nueva clase llamada `Podcast` que también extienda de `Contenido` y sobrescriba el método `reproducir()` con un mensaje personalizado.

### 🔵 Ejercicio 4: Uso de Polimorfismo

Crea una lista de tipo `Contenido[]` y agrega instancias de `Live`, `Video` y `Podcast`. Recorre la lista con un ciclo y llama al método `reproducir()` para cada uno. Observa cómo se comporta cada objeto gracias al polimorfismo.

### 🔴 Ejercicio 5: Validación de Tipos

Usa `instanceof` dentro del ciclo anterior para detectar qué tipo específico de `Contenido` es cada objeto y mostrar un mensaje distinto para cada caso.

---

## 📝 Recomendaciones Finales

- Recuerda que el polimorfismo funciona si todos los objetos heredan de una misma superclase o implementan la misma interfaz.
- Aprovecha las clases abstractas para definir un marco común y delega los detalles en las subclases concretas.
- Evita instanciar directamente clases abstractas; siempre debes usar subclases que las implementen.

---
