# Principios SOLID

![Java](https://img.shields.io/badge/Java-21-blue?style=flat-square&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit-5.14.4-25A162?style=flat-square&logo=junit5&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-9.6.1-02303A?style=flat-square&logo=gradle&logoColor=white)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow?style=flat-square)](LICENSE)
[![YouTube](https://img.shields.io/badge/YouTube-TechCodeTest-FF0000?style=flat-square&logo=youtube&logoColor=white)](https://www.youtube.com/c/TechCodeTest)

Este repositorio es el proyecto base al cual le aplicaremos los principios **SOLID** siguiendo los
episodios que están disponibles en nuestro canal de **YouTube**:
[TechCodeTest](https://www.youtube.com/c/TechCodeTest).

Para más información puedes escribirnos a **tech.code.test@gmail.com** o seguirnos en nuestra cuenta de
Instagram: [tech_code_test](https://www.instagram.com/tech_code_test/).

## Qué es

Una aplicación de consola con un menú de Jedi que enciende y apaga un sable. Es el punto de partida de
la serie: el código funciona, pero mezcla entrada, salida y dibujo en un solo `main`, y ahí es donde se
aplican los principios uno a uno.

| Opción | Acción |
|---|---|
| `1` | Encender el sable |
| `2` | Apagar el sable |
| `0` | Terminar |

## Estructura

```text
src/main/java/com/cedaniel200/solid/App.java   # menú, lectura de entrada y dibujo del sable
```

## Cómo ejecutarlo

Requiere JDK 21; el wrapper descarga Gradle 9.6.1.

```bash
./gradlew run
```

Para generar un jar ejecutable y lanzarlo por separado:

```bash
./gradlew solidJar
java -jar build/libs/solid-1.0.0-all.jar
```

## Requisitos

- JDK 21
- Gradle no hace falta instalarlo: el repositorio incluye el wrapper
