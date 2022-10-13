
package matrices;

import java.util.Scanner;
import java.util.Random; 
public class Matrices {

    public static int[][] matriz; 
    public static Scanner sca; 
    public static Random rand = new Random(200); 
    
    public static void llenarMatriz(){
        System.out.println("Cuantos espacios quieres para las filas");
        int rows = sca.nextInt(); 
        
        System.out.println("Cuantos espaciós quieres para las columnas");
        int colums = sca.nextInt(); 
        
        matriz = new int[rows][colums]; 
        
        System.out.println("Ok a llenarlas");
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                //double datasDouble = Math.random()*100+10;
                
                int datas = rand.nextInt();
                
                matriz[i][j] = datas; 
            }
            
        }
    }
    
    public static void main(String[] args) {
        sca = new Scanner(System.in); 
        System.out.println("Digita: \n"
                + "1)llenar matriz\n"
                + "2)Mostrar Matriz\n"
                + "3)Borrar dato Matriz\n"
                + "4)Ordenar Matriz por Selección\n"
                + "5)Más opiones: \n"
                + "¿Cual escoges?");
        
        int option = sca.nextInt(); 
        
        switch(option){
            case 1:
                
                break; 
            case 2: 
                break; 
            case 3: 
                break; 
            case 4: 
                break; 
            case 5: 
                break; 
            
                
        }
        
    }
    
}
