package MyPkg;

import java.util.Scanner;

public class LargestSmallestArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int large = 0,small = 0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");  
		n=sc.nextInt();  
		
		int a[] = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a[i]=sc.nextInt();  
		}  

		for (int i = 1; i < n; i++) 
		   if (a[i] > large)
		    large = a[i];
		   else if (a[i] < small)
		    small = a[i];
		System.out.println("The Largest Number in the array:"+large);
		System.out.println("The Smallest Number in the array:"+small );
	}

}
