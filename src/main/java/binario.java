import java.util.Scanner;
import java.util.Arrays;

public class binario {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un numero decimal (entero positivo): ");
            int decimalNumber = scanner.nextInt();

            // Definimos el tamaño fijo del array (ej. 8 bits para un byte)
            int arraySize = 8;
            int[] binaryArray = new int[arraySize];

            // Copia temporal del número para las operaciones
            int tempNumber = decimalNumber;

            // Implementación manual de la conversión usando divisiones sucesivas entre 2
            for (int i = arraySize - 1; i >= 0; i--) {
                if (tempNumber > 0) {
                    // El residuo de la división es el bit actual (0 o 1)
                    binaryArray[i] = tempNumber % 2;
                    // El cociente se usa en la siguiente iteración
                    tempNumber = tempNumber / 2;
                } else {
                    // Si el número llega a 0, el resto de bits son 0s (relleno)
                    binaryArray[i] = 0;
                }
            }

            // Mostrar el resultado
            System.out.println("El numero decimal " + decimalNumber + " en binario es:");
            // Imprimir el array con los ceros de relleno
            for (int bit : binaryArray) {
                System.out.print(bit);
            }
            System.out.println();

        }

    }

