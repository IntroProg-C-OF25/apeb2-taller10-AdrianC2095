/**
 *Dada una matriz cuadrada (m X m) de valores enteros aleatorios, 
 * desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 * @author UTPL
 */
import java.util.Scanner;
public class Ejercicio1_DiagonalesMatriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamanioMatriz = 0;
        System.out.print("Dame el limite: ");
        tamanioMatriz = tcl.nextInt();
        int matriz [][] = new int [tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int) (Math.random()*10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("DIAGONAL PRINCIPAL, OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i==j)
                    System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nDIAGONAL PRINCIPAL, EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nDIAGONAL SECUNDARIA, OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i+j) == matriz.length - 1)
                    System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nDIAGONAL SECUNDARIA, EFICIENTE");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length -1 - i] + "\t");
        }
        System.out.println("\nBAJO LA DIAGONAL PRINCIPAL , OBVIA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i>j)
                    System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nBAJO LA DIAGONAL PRINCIPAL , EFICIENTE");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                    System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
