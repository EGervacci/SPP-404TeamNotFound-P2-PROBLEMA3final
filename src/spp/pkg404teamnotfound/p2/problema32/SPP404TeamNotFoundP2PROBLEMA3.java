
package spp.pkg404teamnotfound.p2.problema32;

import  java.util.Scanner;

public class SPP404TeamNotFoundP2PROBLEMA3 {

     public static void main(String[] args) {
      
         matriz();
     
     }
     
     public static void caracteres(){
         char c='*';
     }
     
     
     public static void matriz(){
        int m,n;
        
        System.out.println("Introduzca el tamaño m*n de las matrices\n");
        m=asignarTamaño("m (filas)");
        n=asignarTamaño("n (columnas)");
        System.out.println("\nValores de la matriz: ");
        int[][]A=asignarValores(m,n);
         System.out.println("\n\nel contenido de la matriz es: ");
        mostrarArray(A);
         System.out.println("int to '*' : ");
        for (int i = 0; i < A.length; i++){
            System.out.println();
            for (int j = 0; j < A[0].length; j++){
                for(int k=1;k<=A[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(A[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
        
        }

    

    
    public static int solicitaDatos(){
        Scanner kb=new Scanner(System.in);
        boolean flag;
        int num=0;
        do{      
            try{ 
                num = kb.nextInt(); 
                flag = true;
            }catch (Exception ex) { 
                flag = false;
                System.out.println("\nEl valor insertado es inválido. Introduzca un entero válido.\n" +ex+ "\n");
                kb.nextLine();   
            }
            
        }while(flag==false); 
        return num;
    }
    
    
    public static void mostrarArray(int [][]matrix){ 
            for(int i=0; i<matrix.length; i++){
                for (int j=0; j<matrix[i].length; j++){
                    System.out.print("["+matrix[i][j]+"]");
                    if (j+2>matrix[i].length){
                        System.out.println("\t");
                    }  
                }
            } 

        }
    
    
    public static int[][] asignarValores(int m, int n){
            int[][] matrix = new int [m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println("Introduzca valores para la posición "+i+", "+j);
                    matrix [i][j]=solicitaDatos();
                }    
            }

            return matrix;
        }
    
    
    public static int asignarTamaño(String dimension){
            int x;
            boolean flag;
            System.out.println("Valor de "+dimension);
            do{
                x=solicitaDatos();
                flag=true;
                if(x<1){
                    System.out.println("Introduzca un entero positivo(no hay longitudes negativas  o nulas de matrices)");
                    flag=false;
                }

            }while(flag==false);

            return x; 
        }
}