package juegoahorcado;/*
       Mejoras pendientes
            1- Agregar funcionalidad que solo permita ingresar una palabra
            2- Dar una pista sobre la palabra (hacer esto opcional si el usuario quiere verlo o no);
            3- Agregar interface Grafica.
                3.1- conectar a una base de datos, que se haga click en ver hit, y que muestra la definicion de la palabra
                     por ejemplo si la palabra es encapsulamiento, que muestre la definicion que este guardada en una base de datos





       Borrar esto
       Juego de Ahorcado en Java

        Este proyecto implementa un simple juego de ahorcado en Java. El usuario debe adivinar una palabra secreta seleccionada aleatoriamente de una lista de palabras predefinidas. El juego proporciona retroalimentación sobre la corrección de las letras adivinadas y permite al usuario jugar múltiples veces si lo desea.

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

*/

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public void jugar() {
        boolean seguirJugando = true;
        Scanner scanner = new Scanner(System.in);

        String[] palabras = {
                "Polimorfismo", "java", "clase", "constructore", "programacion",
                "algoritmo", "desarrollo", "sistema", "variable", "metodos",
                "compilador", "depuracion", "consola", "arrays", "interfaz",
                "servidor", "cliente", "base", "datos", "listas",
                "estructuras", "git", "comando", "optimizacion", "geekipedia"
        };
        Random random = new Random();

        while (seguirJugando) {
            // Variables o Atributos reiniciados
            int intentosMaximos = 5;
            int intentoActual = 0;
            boolean palabraAdivinada = false;

            String palabraSecreta = palabras[random.nextInt(palabras.length)];
            char[] letrasAdivinadas = new char[palabraSecreta.length()];

            // Pintar los guiones bajos
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                letrasAdivinadas[i] = '_';
            }

            // Determinar si ya se adivinó o se exceden intentos máximos
            while (!palabraAdivinada && intentoActual < intentosMaximos) {
                System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
                System.out.println("Introduce una Letra, Por favor");

                char letra = Character.toLowerCase(scanner.next().charAt(0));

                boolean letraCorrecta = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                        letraCorrecta = true;
                    }
                }

                if (!letraCorrecta) {
                    intentoActual++;
                    System.out.println("Letra incorrecta! Te Quedan: " + (intentosMaximos - intentoActual) + " Intentos.");
                }

                if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    palabraAdivinada = true;
                    System.out.println("¡Felicidades, has ganado! La palabra era: " + palabraSecreta);
                }
            }

            if (!palabraAdivinada) {
                System.out.println("Ya no te quedan intentos, Game Over. La palabra era: " + palabraSecreta);
            }

            // Preguntar si desea jugar de nuevo
            System.out.println("\n¿Quieres jugar de nuevo? (si/no)");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("no")) {
                seguirJugando = false;
            }
        }

        scanner.close();
        System.out.println("Gracias por jugar!");
    }

}
