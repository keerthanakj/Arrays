package MyPkg;

import java.util.Scanner;

public class SumAverageTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, i, j = 0,sum=0;
		int counter = 0;   
		float average = 0;
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		n = sc.nextInt();   
		  
		int a[][] = new int[m][n];   
		 
		System.out.println("Enter the elements of the array: ");
		for (i = 0; i < m; i++)   
		{
			for (j = 0; j < n; j++) 
			{
				a[i][j] = sc.nextInt(); 
				sum = sum + a[i][j];
				counter++;
			}
			 average = (float)sum / counter;
		}
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < m; i++)   
		{   
			for (j = 0; j < n; j++)  
			{
				System.out.print(a[i][j] + " ");  
			}
			System.out.println();   
		}   
		System.out.println("Sum:"+sum);
      
        System.out.println("Average:"+average);
	
	}

}
