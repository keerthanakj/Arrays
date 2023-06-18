package MyPkg;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();
        
        int[][] matrix = new int[size][size];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();  
            }
        }
        System.out.println("elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            	System.out.print(matrix[i][j] + " ");  
            }
            System.out.println();   
        }
        
        System.out.println("Diagonal elements of the matrix:");
        int sum=0;
        for (int i = 0; i < size; i++) {
           for (int j = 0;j < size; j++) {
        	   if(i == j) {
        		   System.out.println(matrix[i][j] + " ");
        		   sum = sum + matrix[i][j];
        	   }
           }
        }
        System.out.println("The sum of diagonal elements:" +sum);
        sc.close();
    }
}

