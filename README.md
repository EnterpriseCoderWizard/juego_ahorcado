# juego_ahorcado
Este es un Juego de ahorcado en java es muy básico servirá para  practicar git flow y sus mejores practicas


# Juego de Ahorcado en Java

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
