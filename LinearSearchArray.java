package MyPkg;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter those "+n+" elements:");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		s = sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				 System.out.println(s+ " element found at location " + (i + 1) + ".");  
		          break;  
			}
		}
		if(i==s)
		{
			System.out.println(s+ " element not fount in array.");  
		}
	}
}

