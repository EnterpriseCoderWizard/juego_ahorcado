package juegoahorcado;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
            Set<Character> letrasUsadas = new HashSet<>();

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

                String input = scanner.nextLine().toLowerCase();

                if (input.isEmpty() || input.length() > 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Entrada inválida. Por favor, introduce una sola letra.");
                    continue;
                }

                char letra = input.charAt(0);

                if (letrasUsadas.contains(letra)) {
                    System.out.println("Ya has usado esta letra. Prueba con otra diferente.");
                    continue;
                }

                letrasUsadas.add(letra);

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
            scanner.nextLine(); // Consumir el salto de línea
        }

        scanner.close();
        System.out.println("Gracias por jugar!");
    }

    public static void main(String[] args) {
        new Ahorcado().jugar();
    }
}
