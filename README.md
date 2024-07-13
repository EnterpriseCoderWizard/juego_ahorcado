# Aprende Conceptos Básicos de Java Jugando Ahorcado:  Es muy básico servirá para  practicar git flow y sus mejores practicas

Este proyecto implementa un simple juego de ahorcado en Java.
El usuario debe adivinar una palabra secreta seleccionada 
aleatoriamente de una lista de palabras predefinidas. 
El juego proporciona retroalimentación sobre la corrección de las
letras adivinadas y permite al usuario jugar múltiples veces si 
lo desea.

## Funcionalidades

- **Selección Aleatoria de Palabras:** El juego selecciona aleatoriamente una palabra de un array de 25 palabras.
- **Interacción con el Usuario:** El juego solicita al usuario que introduzca letras para adivinar la palabra secreta.
- **Retroalimentación:** El juego muestra guiones bajos por cada letra no adivinada y reemplaza con la letra correcta si el usuario adivina correctamente.
- **Control de Intentos:** El juego permite un número limitado de intentos (5 por defecto) para adivinar la palabra secreta.
- **Reinicio del Juego:** Después de ganar o perder, el juego pregunta al usuario si desea jugar de nuevo. Si el usuario responde "sí", el juego se reinicia; de lo contrario, el juego termina.

## Uso
1. **Ejecución del Juego:** El juego se inicia ejecutando la clase `Ahorcado`. El método `main` crea una instancia de la clase y llama al método `jugar`.
2. **Interacción en la Consola:** El usuario debe seguir las indicaciones en la consola para adivinar la palabra secreta. El usuario puede introducir una letra por intento.
3. **Reinicio del Juego:** Después de cada partida, se le preguntará al usuario si desea jugar de nuevo. Si responde "sí", el juego se reinicia con una nueva palabra secreta y el contador de intentos se restablece.


/-*/-*/-*/-*/-* Implementar las mejoras utilizando GIT-HUB y Git Flow
*-/-*/-*/-*/-*/-*/-*/ MEJORAS AL JUEGO -*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-
Estas mejoras servirán para crear dos branchs o ramas como features a carga de dos equipos

Equipo Uno:

Validación de Entrada del Usuario:

    Asegurarse  usuario ingrese solo letras.

    El usuario No puede Ingresar dos veces la misma Letra
    Maneja entradas vacías y caracteres no válidos.

Equipo Dos:
    Agregar OPCION HIT. Entonces cuando el usuario escriba la palabra HINT
    debera ver pistas sobre cual es la palabra.
    Por Ejemplo: Si la palabra selecciona es encapsulamiento y el usuario escribe Hint Debera ver "Es un Mecanismo para agrupar atributos o métodos como una sola unitdad. Ocultando detalles internos de un objeto pero permitiendo acceder a ciertas partes de él a travez de interfaces publicas"

***** Equipo Tres
    Diseñar una interface Gráfica para poder visualizar el juego y el hombre ahorcado. Sea con JAVA O HTML, JAVASCRPT ETC.
        Debera tener opcion para hacer Click sobre Hint o sobre pistas
    Diseñar una Base de datos en la cual se puedan ir agregando nuevas palabras con sus definiciones








