package MyPkg;

import java.util.Scanner;


public class LinearSearchTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=-1, n=-1, i, j = 0,s;   
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
			}
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
		System.out.println("Enter the element need to search in array:");
		s=sc.nextInt();
		
		
		boolean found = false;
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i][j]==s)
				{
					found = true;
                    m = i;
                    n = j;
                    break;
				}
				
			}
		}

        // Display the search result
        if (found) {
            System.out.println("Element found at position: (" + m + ", " + n + ")");
        } else {
            System.out.println("Element not found in the array.");
        }
		
	}

}
