package matrices;

import java.util.*;
import java.util.Random;

public class Matrices {

    public static int[][] matriz;
    public static int[] vectorAux;
    public static int[] diagoPrincipal;
    public static int[] diagoSecundaria;
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
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < colums; j++) {

                //double datasDouble = Math.random()*100+10;
                //Aquí escoge números aleatorios de 0 a 200
                datas = rand.nextInt(100);
                matriz[i][j] = datas;
                int dato = matriz[i][j];
            }

        }

        System.out.println("Matrices LLenas");
        System.out.println("¿quieres ver la matriz? 1)si, 0)no");
        int res = sca.nextInt();

        if (res != 0) {
            mostrarMatriz();
        } else {
            System.out.println("");
        }
    }

    public static void ordenarMatriz() {
        //Primero se crea la lista (Recuerda que es List<Integer>)
        //profe le vote casi todo un dia y esta probado se que funciona 

        list = new ArrayList<Integer>();
        count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                matriz[i][j] = vectorAux[count];
                count++;
            }
        }
        mostrarMatriz();
    }

    public static void borrardato() {
        for (int i = 0; i < rows; i++) {
            System.out.println("Fila:" + i);
            for (int j = 0; j < colums; j++) {
                System.out.print(j + ".");
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println();
        }

        System.out.println("¿En que fila se encuentra el dato?");
        int row = sca.nextInt();
        System.out.println("¿En que posicion de la fila " + row + " se encuentra el dato?");
        int colum = sca.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (i == row && j == colum) {
                    System.out.println("Se borro el dato: " + matriz[i][j]);
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("¿quieres ver la nueva matriz? 1)si, 0)no");
        int res = sca.nextInt();

        if (res != 0) {
            mostrarMatriz();
        } else {
            System.out.println("Ok, Ya no podras volverla a ver (la matriz con el dato borrado)");
        }

    }

    public static void visualizarDiagonal(int[] vectoring) {

        for (int i = 0; i < vectoring.length; i++) {
            System.out.print("\t" + vectoring[i]);
        }
        System.out.println("");
    }

    public static void trianguloInferior() {
        //Se crea una lista para la matriz
        list = new ArrayList<Integer>();
        
        //se crea una lista para el vector
        List<Integer> listVector = new ArrayList<Integer>();
        Vector vector = new Vector();
        
        
        
        //Se pasa la matriz a la lista
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
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
        
        //Se pasa el vector a la lista para el vector
        for (int i = 0; i < vectorAux.length; i++) {
            listVector.add(vectorAux[i]);
        }
        count = 0;

        int totalMatriz = rows + colums;

        int order = totalMatriz / 2;
        //Creamos la matriz modificada 
        int[][] matrizModify = new int[order][order];
        
        //y pasamos la lista del vector a la matriz modificada
        outer: for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                //se le pone un limitante al contador
                if(count == vectorAux.length){
                    break outer;
                }
                matrizModify[i][j] = vectorAux[count];
                count++;
            }
            
        }
        
        //Imprimimos la matriz modificada 
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print("[" + matrizModify[i][j] + "]");
            }
            System.out.println("");
        }
        
        //Se muestra el triangulo inferior de la matriz 
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("[" + matrizModify[i][j] + "]");
            }
            System.out.println("");
        }

    }

    public static void masOptions() {
        System.out.println("\n\nAdvertencia: Estas opciones funcionan mejor con matrices"
                + " Cuadradas.\n\n"
                + "a)Diagonal Principal\n"
                + "b)Diagonal Segundaria\n"
                + "c)Triangulo superior\n"
                + "d)Triangulo inferior\n"
        );
        String answer = sca.next();

        switch (answer) {
            case "a":
                diagoPrincipal = new int[matriz.length];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == j) {
                            diagoPrincipal[i] = matriz[i][j];
                        }

                    }
                }
                mostrarMatriz();
                System.out.println("\n\nDiagonal Principal");
                visualizarDiagonal(diagoPrincipal);

                break;
            case "b":
                diagoSecundaria = new int[matriz.length];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i + j == matriz.length - 1) {
                            diagoSecundaria[i] = matriz[i][j];
                        }
                    }
                }
                mostrarMatriz();
                System.out.println("\n\nDiagonal Secundaria");
                visualizarDiagonal(diagoSecundaria);
                break;

            case "c":
                int totalMatriz = rows + colums;
                int order = totalMatriz / 2;

                break;
            case "d":
                trianguloInferior();
                break;
            default:
                System.out.println("Opcion equivocada");
                break;
        }
    }

    public static void mostrarMatriz() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

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
                    + "0)salir"
                    + "¿Cual escoges?");

            int option = sca.nextInt();

            switch (option) {
                case 1:
                    llenarMatriz();
                    break;
                case 2:
                    if (matriz != null) {
                        mostrarMatriz();
                    } else {
                        System.out.println("No has llenado la matris");
                    }
                    break;
                case 3:
                    if (matriz != null) {
                        ordenarMatriz();
                    } else {
                        System.out.println("No has llenado la matris");
                    }
                    break;
                case 4:
                    if (matriz != null) {
                        borrardato();
                    } else {
                        System.out.println("No has llenado la matris");
                    }
                    break;
                case 5:
                    if (matriz != null) {
                        masOptions();
                    } else {
                        System.out.println("No has llenado la matris");
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    sw = 0;
                    break;
                default:
                    System.out.println("Opcion equivocada");
                    break;
            }
        }
    }

}
