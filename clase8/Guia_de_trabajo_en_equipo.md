# Guía de Colaboración - Proyecto Java OOP con Patrón Strategy

Este documento describe las posibles líneas de trabajo para que cada estudiante-colaborador pueda contribuir de forma estructurada al proyecto colaborativo. El objetivo es seguir desarrollando el proyecto centrado en **Programación Orientada a Objetos (POO)** y el **patrón de diseño Strategy**, integrando también el principio de **inyección de dependencias**.

## Estructura General del Proyecto

Actualmente el proyecto tiene:

- Una clase `Criatura`, que representa a un personaje en batalla.
- Una interfaz `EstrategiaBatalla`, con diferentes implementaciones que definen comportamientos.
- Comportamientos actuales: `ComportamientoAgresivo` y `ComportamientoDefensivo`.
- Clase principal `App.java` que lanza una batalla entre dos criaturas.

Cada colaborador puede elegir una de las siguientes líneas de trabajo.

---

## 1. Nuevos Comportamientos (Strategy)

**Objetivo**: Implementar nuevas estrategias que extiendan el comportamiento de una criatura en batalla.

**Clase base**: `EstrategiaBatalla` (interfaz)

**Ejemplos de comportamientos a implementar:**

- **ComportamientoCurativo**: La criatura se regenera.
- **ComportamientoEvasivo**: La criatura se enfoca en esquivar el próximo ataque.
- **ComportamientoEnvenenador**: La criatura aplica un daño progresivo durante varios turnos.
- **ComportamientoAletargador**: Reduce el ataque del enemigo temporalmente.

Cada colaborador debe crear una clase que implemente la interfaz `EstrategiaBatalla` y definir claramente la acción ejecutada.

---

## 2. Nuevos Tipos de Criaturas

**Objetivo**: Introducir subtipos de criaturas con características o habilidades especiales.

**Clase base**: `Criatura`

**Posibles extensiones:**

- **CriaturaMagica**: Puede almacenar puntos de energía mágica y usarlos en combate.
- **CriaturaTanque**: Recibe menos daño y tiene defensa extra.
- **CriaturaVeloz**: Tiene la posibilidad de atacar dos veces en un turno.
- **CriaturaCamaleon**: Copia el comportamiento del enemigo por un turno.

Estas clases pueden heredar de `Criatura` o estar compuestas por ella (composición), según la decisión de diseño del estudiante.

---

## 3. Sistema de Menú Interactivo (Entrada de Usuario)

**Objetivo**: Desarrollar una interfaz de usuario en consola para gestionar criaturas y batallas.

**Módulo propuesto**: `MenuConsola`

**Funciones esperadas:**

1. Crear criaturas personalizadas (nombre, ataque, defensa, estrategia).
2. Listar criaturas disponibles.
3. Elegir dos criaturas para batalla.
4. Mostrar opciones de estrategias disponibles.
5. Ejecutar batalla por turnos y mostrar el resultado.

Debe manejar entrada del usuario mediante `Scanner`, validar datos ingresados y permitir volver al menú principal.

---

## 4. Módulo de Batalla (Lógica de turnos)

**Objetivo**: Administrar los turnos de batalla, controlar el flujo del combate, mostrar resultados.

**Clase propuesta**: `ArenaDeBatalla`

**Requisitos funcionales:**

- Controlar turnos alternos entre dos criaturas.
- Terminar cuando una criatura quede sin vida.
- Mostrar resultados de cada acción en consola.
- Permitir cambio de estrategias entre turnos (opcional).

---

## 5. Registro de Batalla

**Objetivo**: Guardar en un archivo de texto los resultados de cada batalla.

**Clase propuesta**: `RegistroBatalla`

**Responsabilidades:**

- Escribir en un archivo `registro.txt` cada acción de la batalla.
- Guardar nombre de los combatientes, estrategias usadas y resultado final.
- Crear el archivo si no existe.

---

## 6. Diagrama de Clases (PlantUML)

```plantuml
@startuml
interface EstrategiaBatalla {
  +actuar(c: Criatura, enemigo: Criatura)
}

class ComportamientoAgresivo implements EstrategiaBatalla
class ComportamientoDefensivo implements EstrategiaBatalla
' (Otros comportamientos futuros también implementan esta interfaz)

class Criatura {
  -nombre: String
  -vida: int
  -ataque: int
  -defensa: int
  -esquivaActiva: boolean
  -estrategia: EstrategiaBatalla
  +setEstrategia(estrategia: EstrategiaBatalla)
  +ejecutarAccion(enemigo: Criatura)
  +reducirVida(dano: int)
  +aumentarDefensa(cantidad: int)
  +activarEsquiva()
}

Criatura --> EstrategiaBatalla
ComportamientoAgresivo ..|> EstrategiaBatalla
ComportamientoDefensivo ..|> EstrategiaBatalla

class App {
  +main(args: String[])
}

App --> Criatura
@enduml


