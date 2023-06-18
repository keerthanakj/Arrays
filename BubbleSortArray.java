package MyPkg;

import java.util.Scanner;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter those "+n+" elements:");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		 System.out.println();
		 
		//Ascending order of bubble sort
	    for(i=0; i < n; i++)
	    {  
	         for(j=1; j < (n-i); j++)
	         {  
	               if(a[j-1] > a[j])
	               {  
	                     temp = a[j-1];  
	                     a[j-1] = a[j];  
	                     a[j] = temp;  
	               }  
	         }  
	     }
        System.out.println("Ascending Oder of Bubble Sort:");  
        for(i=0; i < n; i++){  
                System.out.print(a[i] + " ");  
        }
        System.out.println();
        
        //Descending order of bubble sort
        for(i=0; i < n; i++)
	    {  
	         for(j=1; j < (n-i); j++)
	         {  
	               if(a[j-1] < a[j])
	               {  
	                     temp = a[j-1];  
	                     a[j-1] = a[j];  
	                     a[j] = temp;  
	               }  
	         }  
	     }
        System.out.println("Descending order of Bubble Sort:");  
        for(i=0; i < n; i++){  
                System.out.print(a[i] + " ");  
        }
        System.out.println();
	}

}
