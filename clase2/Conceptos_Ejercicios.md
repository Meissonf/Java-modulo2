# Clase 2: Encapsulamiento, Getters y Setters en Java

## Parte Teórica: ¿Qué es el Encapsulamiento?

El **encapsulamiento** es uno de los pilares de la Programación Orientada a Objetos. Su función principal es **ocultar el estado interno de un objeto** y permitir el acceso controlado a sus datos a través de métodos.

### ✅ Conceptos Clave:
- Los atributos de una clase se declaran como `private`.
- Se crean métodos `get` para obtener el valor de los atributos.
- Se crean métodos `set` para modificar los atributos (si es necesario).

**Beneficios:**
- Protege los datos.
- Permite controlar los cambios.
- Mejora la mantenibilidad del código.

### 📄 Ejemplo de Clase: `PerfilInstagram`
```java
public class PerfilInstagram {

    private String nombreUsuario;
    private int seguidores;
    private boolean cuentaPrivada;

    public PerfilInstagram(String nombreUsuarioEnviado){
        nombreUsuario = nombreUsuarioEnviado;
        seguidores = 0;
        cuentaPrivada = false;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public int getSeguidores(){
        return seguidores;   
    }

    public boolean getCuentaPrivada(){
        return cuentaPrivada;
    }

    public void seguir(){
        seguidores++;
    }

    public void dejarSeguir(){
        if(seguidores > 0){
            seguidores--;
        }
    }

    public void cambiarPrivacidad(){
        cuentaPrivada = !cuentaPrivada;
    }
}
```

---

## 📚 Parte Práctica: Ejercicios Progresivos

### 💬 Ejercicio 1 – "Perfil en TikTok"
**Objetivo:** Encapsular atributos y acceder mediante getters y setters.

```java
// Clase: PerfilTikTok
// Atributos privados: usuario (String), seguidores (int), esVerificado (boolean)
// Agrega un constructor para el nombre.
// Agrega métodos get y set para cada atributo.
// Crea un objeto, modifica sus valores y muéstralos.
```

---

### 📱 Ejercicio 2 – "Estado de WhatsApp"
**Objetivo:** Aplicar encapsulamiento con texto y booleanos.

```java
// Clase: Estado
// Atributos: texto (String), visible (boolean)
// Constructor para texto.
// Agrega getter y setter para ambos atributos.
// Crea 2 estados, uno visible y otro oculto.
```

---

### 🚀 Ejercicio 3 – "Estadísticas de Jugador"
**Tema:** Videojuegos

```java
// Clase: Jugador
// Atributos privados: nombre (String), nivel (int), salud (int)
// Constructor que inicialice nombre y salud a 100.
// Getters para todos, y setters sólo para salud.
// Sube de nivel cada vez que llames un método subirNivel().
```

---

### 💼 Ejercicio 4 – "Publicación en Facebook"
**Objetivo:** Uso de encapsulamiento + lógica interna.

```java
// Clase: Publicacion
// Atributos: mensaje (String), likes (int), compartido (boolean)
// Constructor para mensaje.
// Método darLike() y compartir()
// Getters y setters solo donde tenga sentido.
```

---

### 🚪 Ejercicio 5 – "Configuración de Privacidad"
**Tema:** Aplicación web o red social

```java
// Clase: Configuracion
// Atributos privados: modoOscuro (boolean), notificaciones (boolean)
// Getters y setters para ambos.
// Métodos para activar o desactivar las opciones.
// Crea 2 configuraciones distintas.
```

---

### 🛎 Ejercicio 6 – "Carrito de compras online"
**Tema:** E-commerce

```java
// Clase: Producto
// Atributos: nombre (String), precio (double), cantidad (int)
// Constructor para nombre y precio.
// Getters y setters.
// Método calcularTotal() = precio * cantidad
```

---

### 👨‍💼 Ejercicio 7 – "Usuario con Seguridad"
**Tema:** Seguridad en aplicaciones

```java
// Clase: UsuarioSeguro
// Atributos privados: usuario (String), contrasena (String)
// Solo getter para usuario.
// Método validarContrasena(String intento)
// Método cambiarContrasena(String nueva, String anterior)
```

---

### 🎮 Desafío Final – "App de Mensajes con Contactos"
**Objetivo:** Integrar encapsulamiento, getters, setters y lógica.

```java
// Clase: Contacto
// Atributos: nombre (String), estaBloqueado (boolean)

// Clase: Mensaje
// Atributos: contenido (String), destinatario (Contacto)

// Crea varios contactos y mensajes, muestra sus datos,
// e implementa lógica para evitar enviar mensajes a contactos bloqueados.
```

