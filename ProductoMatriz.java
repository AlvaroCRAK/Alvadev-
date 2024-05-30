// Producto entre matrices

import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Matriz 1:");
        System.out.print("Ingrese el numero de filas: "); int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: "); int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];

        System.out.println("Matriz 2:");
        System.out.print("Ingrese el numero de filas: "); filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas: "); columnas = scanner.nextInt();

        int[][] matriz2 = new int[filas][columnas];

        llenar(matriz1, random);
    
        llenar(matriz2, random);

        mostrar(matriz1);

        mostrar(matriz2);

        if(matriz1[0].length == matriz2.length)
            producto(matriz1, matriz2);



    }

    static void mostrar(int[][] matriz){
        for(int[] i : matriz){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void llenar(int[][] matriz, Random random){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(5) + 1;
            }
        }
    }

    static void producto(int[][] matriz1, int[][] matriz2){
        int filas = matriz1.length;
        int columnas = matriz2[0].length;

        int[][] producto = new int[filas][columnas];

        for(int i = 0; i < filas; i++){
            System.out.print(" | ");
            for(int j = 0; j < columnas; j++){
                System.out.print(" ( ");
                for(int k = 0; k < matriz2.length; k++){
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    System.out.print(matriz1[i][k] + " * " + matriz2[k][j]);
                    
                    if(k != matriz2.length - 1)
                        System.out.print(" + ");
                }
                System.out.print(" ) ");
            }
            System.out.println(" |");
        }
        

        mostrar(producto);
    }
}
