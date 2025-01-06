
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        int matriz[][] = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        // Elementos de la diagonal principal
        System.out.println("\nElementos de la diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        // Elementos de la diagonal secundaria
        System.out.println("\nElementos de la diagonal secundaria: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        // Elementos ubicados bajo la diagonal principal.
        System.out.println("\nElementos ubicados bajo la diagonal principal: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        // Elementos ubicados sobre la diagonal principal.
        System.out.println("\nElementos ubicados sobre la diagonal principal: ");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        // Elementos ubicados bajo la diagonal secundaria.
        System.out.println("\nElementos ubicados bajo la diagonal secundaria: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        // Elementos ubicados sobre la diagonal secundaria
        System.out.println("\nElementos ubicados sobre la diagonal secundaria: ");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = matriz.length - 1 - i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}

/***
 * 1	7	5	2	3	8	
 * 4	5	7	2	6	8	
 * 4	6	5	6	0	2	
 * 0	3	7	4	1	8	
 * 9	5	5	9	1	7	
 * 0	0	7	1	3	3	
 * Elementos de la diagonal principal: 
 * 1	5	5	4	1	3	
 * Elementos de la diagonal secundaria: 
 * 8	6	6	7	5	0	
 * Elementos ubicados bajo la diagonal principal: 
 * 4	4	6	0	3	7	9	5	5	9	0	0	7	1	3	
 * Elementos ubicados sobre la diagonal principal: 
 * 7	5	2	3	8	7	2	6	8	6	0	2	1	8	7	
 * Elementos ubicados bajo la diagonal secundaria: 
 * 4	5	7	2	4	6	5	0	3	9	
 * Elementos ubicados sobre la diagonal secundaria: 
 * 8	0	2	4	1	8	5	9	1	7
 */
