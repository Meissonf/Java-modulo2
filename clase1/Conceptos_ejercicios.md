# Clase 1: Clases y Constructores en Java

## ✨ Parte Teórica: ¿Qué son las Clases y Constructores en Java?

### ✅ ¿Qué es una clase?
Una **clase en Java** es como un **molde** o **plantilla** que define cómo deben ser los objetos. Contiene:
- **Atributos** (variables que describen las características).
- **Métodos** (acciones o comportamientos que puede realizar).

**Ejemplo básico:**
```java
public class Usuario {
    String nombre;
    int edad;
}
```

> Es como definir cómo debe ser un "Usuario" en una red social.

### ✅ ¿Qué es un constructor?
Un **constructor** es un método especial dentro de una clase que se llama automáticamente cuando se crea un objeto. Sirve para **inicializar los atributos** de ese objeto.

**Características del constructor:**
- Tiene el mismo nombre que la clase.
- No tiene tipo de retorno (ni `void`).
- Puede haber **más de uno** (sobrecarga).

**Ejemplo:**
```java
public class Usuario {
    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```

**Crear un objeto con constructor:**
```java
Usuario u = new Usuario("Ana", 20);
```

---

## 🎮 Parte Práctica: Ejercicios Progresivos

Temáticas atractivas: redes sociales, videojuegos y apps web.

### 🧹 Ejercicio 1 – "Perfil básico"
**Tema:** Red social  
**Objetivo:** Crear una clase simple y un constructor básico.

```java
// Crea una clase llamada Perfil con atributos: nombre (String), edad (int)
// Crea un constructor para inicializar estos atributos.
// Crea un objeto desde el main y muestra sus datos.
```

---

### 🎵 Ejercicio 2 – "Canción favorita"
**Tema:** Spotify 
**Objetivo:** Introducir otro tipo de datos y mejorar el constructor.

```java
// Clase: Cancion
// Atributos: titulo (String), artista (String), duracionSegundos (int)
// Agrega un constructor.
// Crea 3 objetos con diferentes canciones.
```

---

### 📲 Ejercicio 3 – "Post en red social"
**Tema:** Instagram/Facebook  
**Objetivo:** Usar constructores con múltiples parámetros.

```java
// Clase: Post
// Atributos: autor (String), mensaje (String), likes (int)
// Constructor con parámetros.
// Crea un objeto Post y simula un posteo imprimiendo los datos.
```

---

### 🎮 Ejercicio 4 – "Avatar del videojuego"
**Tema:** Videojuegos  
**Objetivo:** Integrar datos numéricos y lógicos.

```java
// Clase: Avatar
// Atributos: nombre (String), nivel (int), esPremium (boolean)
// Constructor.
// Crea dos avatares distintos y muéstralos.
```

---

### 🛒 Ejercicio 5 – "Producto en carrito de compras"
**Tema:** Tienda en línea  
**Objetivo:** Usar constructores, incluir operaciones y formato.

```java
// Clase: Producto
// Atributos: nombre (String), precio (double), cantidad (int)
// Constructor.
// Crea 3 productos y muestra el total por cada uno (precio * cantidad).
```

---

### 🧑‍🤝‍🧑 Ejercicio 6 – "Amigos en red social"
**Tema:** Red social  
**Objetivo:** Crear objetos y relacionarlos.

```java
// Clase: Usuario
// Atributos: nombre (String), edad (int), amigo (Usuario)
// Constructor para nombre y edad.
// Agrega atributo amigo, crea dos usuarios y enlázalos como amigos.
```

---

### 🔄 Ejercicio 7 – "Partida multijugador"
**Tema:** Videojuego  
**Objetivo:** Crear varios objetos y usarlos juntos.

```java
// Clase: Jugador
// Atributos: nick (String), puntos (int)
// Constructor.
// Crea 4 jugadores y muestra el ranking según los puntos.
```

---

### 🚀 Ejercicio 8 – (Desafío Final) "Red social con publicaciones"
**Tema:** Proyecto integrador  
**Objetivo:** Composición de clases.

```java
// Clase: Usuario
// Atributos: nombre (String), edad (int)

// Clase: Publicacion
// Atributos: contenido (String), autor (Usuario), likes (int)

// Crea 2 usuarios, cada uno con una publicación.
// Muestra las publicaciones y el nombre del autor.
```

