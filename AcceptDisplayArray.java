package MyPkg;

import java.util.Scanner;

public class AcceptDisplayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");  
		n=sc.nextInt();  
		
		int a[] = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		
		for (int i=0; i<n; i++)   
		{  
		System.out.println(a[i]);  
		}  
	}

}
