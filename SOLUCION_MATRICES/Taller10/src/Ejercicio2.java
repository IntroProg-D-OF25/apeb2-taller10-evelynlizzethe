
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random random = new Random();

        // Generar dimensiones y matrices aleatorias
        int filas1 = 4, columnas1 = 4;
        int filas2 = 4, columnas2 = 4;

        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = random.nextInt(10); 
            }
        }

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = random.nextInt(10); 
            }
        }

        System.out.println("Matriz 1:");
        for (int[] fila : matriz1) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2:");
        for (int[] fila : matriz2) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Intentar sumar matrices
        if (filas1 == filas2 && columnas1 == columnas2) {
            System.out.println("\nSuma de matrices:");
            int[][] suma = new int[filas1][columnas1];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            for (int[] fila : suma) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se pueden sumar las matrices porque tienen dimensiones diferentes");
        }

        // Intentar multiplicar matrices
        if (columnas1 == filas2) {
            System.out.println("\nProducto de matrices:");
            int[][] producto = new int[filas1][columnas2];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    for (int k = 0; k < columnas1; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            for (int[] fila : producto) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se pueden multiplicar las matrices porque sus dimensiones no son compatibles");
        }
    }
}

/***
 * Matriz 1:
8 4 1 1 
6 2 8 1 
6 2 0 7 
6 4 1 9 

Matriz 2:
9 5 9 7 
3 8 7 5 
1 0 0 3 
1 3 3 0 

Suma de matrices:
17 9 10 8 
9 10 15 6 
7 2 0 10 
7 7 4 9 

Producto de matrices:
86 75 103 79 
69 49 71 76 
67 67 89 52 
76 89 109 65 
 */
