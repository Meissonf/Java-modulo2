# 🎵 Serie de Ejercicios: Recomendador de Canciones Emocionales

## 🎓 Base Teórica: Guía para Comprender el Patrón Strategy e Inyección de Dependencias

---

### 🛜1. Fundamento: ¿Por qué existen los patrones de diseño?

Supongamos que estás construyendo una casa. No empiezas desde cero cada vez: hay formas ya conocidas y eficaces de hacer puertas, ventanas, techos, etc. Los patrones de diseño en programación son como esos planos o recetas: soluciones ya probadas para problemas que se repiten una y otra vez cuando construimos software.

Los programadores, al igual que los arquitectos, también enfrentan desafíos comunes. Por ejemplo:

¿Cómo conectar distintas partes del programa sin que queden muy dependientes entre sí?

¿Cómo crear objetos sin repetir el mismo código una y otra vez?

¿Cómo permitir que una parte del sistema cambie sin romper todo lo demás?

Aquí es donde entran los patrones de diseño. Sirven para:

👽 Hacer sistemas flexibles y fáciles de mantener: como una casa donde puedes cambiar una pared sin tumbar todo.

🕹️ Aplicar buenas prácticas (como los principios SOLID) que nos ayudan a escribir buen código.

👾 Mejorar la lectura y el uso del código: otros programadores pueden entender lo que hiciste porque usaste una solución conocida.


---

### 🌐 2. Conceptos previos que debes dominar:

Para abordar esta serie de ejercicios con comodidad, recuerda estos conceptos clave:

- **Programación orientada a objetos (POO):** especialmente interfaces, herencia y polimorfismo.
- **Inyección de dependencias:** técnica para proporcionar objetos desde fuera de una clase en lugar de crearlos dentro.

---

### ⏩  3. Patrón Strategy

Ahora vamos a suponer que debemos desarrollar una app para calcular el precio de envío de paquetes. A veces el envío es por tierra, otras veces por aire o por mar. ¡Cada uno tiene su propia forma de calcular el precio!

Podrías escribir todo en una sola función, con muchos "si esto... entonces aquello", pero eso haría el código difícil de entender y de cambiar. Aquí es donde entra el Patrón Strategy.

**¿Cómo funciona?**
El Patrón Strategy te permite tener una familia de algoritmos (como los distintos métodos de envío) y poner cada uno en su propia “cajita” (clase). Luego, puedes decirle a tu programa:
“Hoy vamos a usar este algoritmo, pero mañana podemos cambiarlo por otro sin tocar nada más.”

 🔔 **¿Qué beneficios tiene?**
Separa la lógica de cómo se hace algo del lugar donde se usa.
Ejemplo: no necesitas saber cómo se calcula el precio del envío, solo decir usa este método.

Es fácil agregar nuevas estrategias sin romper lo que ya funciona.
Esto sigue el principio Abierto/Cerrado: puedes extender el código sin modificarlo.

 Evita repetir código que sería muy similar en distintas partes del programa.


---

###  4. Inyección de Dependencias (DI)

La DI es un principio que indica que las dependencias deben ser pasadas desde fuera de la clase (por constructor, método o propiedad), en lugar de ser creadas internamente.

**Beneficios:**

- Favorece el desacoplamiento.
- Facilita la prueba unitaria (mockeo de dependencias).
- Refuerza el principio de Inversión de Dependencias.

---

## 📄 Esquema de Desarrollo

---

### 🤖 Nivel 1 – Iniciación: Selección básica con Strategy

**Objetivo:** Aplicar Strategy para recomendar canciones según el estado de ánimo.

**Estructura sugerida:**

**Interfaz:**
- `RecomendadorEstadoAnimo`
  - `recomendar(): List<String>`

**Estrategias concretas:**
- `RecomendadorFeliz`
- `RecomendadorTriste`
- `RecomendadorEnfocado`

**Clase principal:**
- `Reproductor`
  - Atributo: `estrategia: RecomendadorEstadoAnimo`
  - Método: `reproducirRecomendaciones()`

---

### 👽 Nivel 2 – Intermedio: Cambio dinámico de estrategia

**Objetivo:** Permitir cambiar la estrategia (estado de ánimo) en tiempo de ejecución.

**Cambios:**

**Clase Reproductor:**
- Método adicional: `cambiarEstadoAnimo(nuevaEstrategia: RecomendadorEstadoAnimo)`
- Simular un flujo donde se usan 3 estrategias distintas en una sesión

---

### 🕹️ Nivel 3 – Avanzado: Personalización y datos

**Objetivo:** Usar información del usuario para personalizar las recomendaciones.

**Nuevas clases y modificaciones:**

**Clase:**
- `Usuario`
  - Atributos: `nombre`, `edad`, `generoFavorito`, `artistaFavorito`

**Estrategias:**
- Constructor debe recibir instancia de `Usuario`
- Personalizar recomendaciones según los gustos del usuario

**Reproductor:**
- Atributo adicional: `usuario: Usuario`

---

### 🎮 Nivel 4 – Desafío adicional: Integración de múltiples fuentes

**Objetivo:** Simular que las canciones provienen de distintas fuentes musicales.

**Nuevas interfaces y clases:**

**Interfaz:**
- `FuenteMusical`
  - `buscarCanciones(estadoAnimo: String): List<String>`

**Implementaciones:**
- `SpotifyFuente`
- `YouTubeFuente`
- `LocalFuente`

**Estrategias:**
- Atributo: `fuente: FuenteMusical`
- Constructor: recibir `Usuario` y `FuenteMusical`

**Doble inyección:**
- La fuente musical se inyecta en la estrategia
- La estrategia se inyecta en `Reproductor`

---

###  ✌️ Nivel DIOS – Reto Final: Sistema de recomendaciones con IA simulada

**Objetivo:** Adaptar las recomendaciones según las reacciones del usuario.

**Nuevas clases y ampliaciones:**

**Clase `Usuario`:**
- Nuevo atributo: `historialReproduccion: List<RegistroCancion>`

**Clase auxiliar:**
- `RegistroCancion`
  - `titulo`, `meGusto: Boolean`, `timestamp`

**Estrategia nueva:**
- `RecomendadorAprendizFeliz`
  - Usa el historial del usuario para mejorar las sugerencias

**Clase Reproductor:**
- Método: `registrarReaccion(cancion: String, reaccion: Boolean)`
- Simular reacciones aleatorias

**(Opcional) Interfaz por consola:**
- Menú simple para elegir estado de ánimo y registrar reacciones

---

##  Resultado esperado

Al finalizar esta serie de ejercicios, deberías haber comprendido y aplicado:

- El Patrón Strategy y su implementación correcta
- Inyección de dependencias de distintos niveles
- Aplicación progresiva de comportamiento dinámico
- Principios SOLID en diseño de software
- Diseño flexible y mantenible a medida que se escala la complejidad
