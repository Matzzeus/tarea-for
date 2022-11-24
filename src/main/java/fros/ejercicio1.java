
package fros;

import java.util.Scanner;


public class ejercicio1 {
    
    public static void main(String[] args) {
        
       
         
         
         int matriz [][] = new int [5][4];
         int cantidad = 1;
         
         for (int i = 0; i < matriz[i].length; i++) {
             
              for (int j = 0; j < matriz[j].length; j++) {
                  Scanner src = new Scanner(System.in);
                 System.out.println(" ingrese numero entero" +  cantidad);
                 matriz[i][j] = src.nextInt();
                 cantidad ++;
                 
                 
             }
             
         }
         
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.println(" | " + matriz [i][j]);
                 
             }
             System.out.println("");
             System.out.println("------------------");
         }
         
     }
            
        
        
        
        
        
    }
    
    

