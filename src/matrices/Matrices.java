package matrices;

import java.util.Scanner;
import java.util.Random;

public class Matrices {

    public static int[][] matriz;
    public static int[] vectorAux;
    public static Scanner sca;
    public static Random rand = new Random();
    public static int sw = 1;
    public static int rows;
    public static int colums;
    public static int datas;
    public static int count = 0;

    public static void llenarMatriz() {
        System.out.println("Cuantos espacios quieres para las filas");
        rows = sca.nextInt();

        System.out.println("Cuantos espaciós quieres para las columnas");
        colums = sca.nextInt();

        matriz = new int[rows][colums];
        int espaciovector = rows + colums;
        vectorAux = new int[espaciovector];
        System.out.println("Ok, a llenarlas");
        count = 0;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < colums; j++) {

                //double datasDouble = Math.random()*100+10;
                //Aquí escoge números aleatorios de 0 a 200
                datas = rand.nextInt(100);
                matriz[i][j] = datas;

            }

        }
        System.out.println("Matrices LLenas");
        System.out.println("¿quieres ver la matriz? 1)si, 0)no");
        sw = sca.nextInt();

        if (sw != 0) {
            System.out.println("Escoge la opción 2");
        } else {
            System.out.println("Adios");
        }
    }

    public static void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

    }

    public static void ordenarMatriz() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                       
                    }
                }

            }
        }

        mostrarMatriz();
    }

    public static void main(String[] args) {
        sca = new Scanner(System.in);
        while (sw != 0) {
            System.out.println("Digita: \n"
                    + "1)llenar matriz\n"
                    + "2)Mostrar Matriz\n"
                    + "3)Ordenar Matriz por Selección\n"
                    + "4)Borrar dato Matriz\n"
                    + "5)Más opiones: \n"
                    + "¿Cual escoges?");

            int option = sca.nextInt();

            switch (option) {
                case 1:
                    llenarMatriz();

                    break;
                case 2:
                    mostrarMatriz();
                    break;
                case 3:
                    ordenarMatriz();
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }
        }
    }

}
