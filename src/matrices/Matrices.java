package matrices;

import java.util.*;
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
    public static Integer count = null;
    public static List<Integer> list;

    public static void llenarMatriz() {
        System.out.println("Cuantos espacios quieres para las filas");
        rows = sca.nextInt();

        System.out.println("Cuantos espaciós quieres para las columnas");
        colums = sca.nextInt();
        int rc = rows + colums;
        matriz = new int[rows][colums];
        vectorAux = new int[rc];
        System.out.println("Ok, a llenarlas");
        count = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                //double datasDouble = Math.random()*100+10;
                //Aquí escoge números aleatorios de 0 a 200
                datas = rand.nextInt(100);
                matriz[i][j] = datas;
                int dato = matriz[i][j];
            }

        }

        System.out.println("Matrices LLenas");
        System.out.println("¿quieres ver la matriz? 1)si, 0)no");
        sw = sca.nextInt();

        if (sw != 0) {
            mostrarMatriz();
        } else {
            System.out.println("Adios");
        }
    }

    public static void ordenarMatriz() {
        //Primero se crea la lista (Recuerda que es List<Integer>)
        //profe le vote case todo un dia y esta probado de que funciona 
        list = new ArrayList<Integer>();
        count = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //Se pasa el matriz a la lista
                list.add(matriz[i][j]);
            }
        }
        
        //Sea crea el vector con el tamaño de la lista (int[])
        vectorAux = new int[list.size()];
        for (int i = 0; i < vectorAux.length; i++) {
            //Se pasa la lista al vector
            vectorAux[i] = list.get(i);
        }

        for (int i = 0; i < vectorAux.length; i++) {
            for (int j = i; j < vectorAux.length; j++) {
                if (vectorAux[i] > vectorAux[j]) {
                    Integer temp;
                    temp = vectorAux[j];
                    vectorAux[j] = vectorAux[i];
                    vectorAux[i] = temp;
                }
            }
        }
//        for (int i = 0; i < vectorAux.length; i++) {
//            System.out.println("[" + vectorAux[i]+"]");
//        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = vectorAux[count];
                count++;
            }
        }
        mostrarMatriz();
    }

    public static void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

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
