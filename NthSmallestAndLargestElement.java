package MyPkg;

import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestAndLargestElement {
    public static void main(String[] args) {
    	int temp;
        Scanner sc = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Get the array elements from the user
        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Sort the array in ascending order
        for (int i = 0; i < size; i++) {     
            for (int j = i + 1; j < size; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < size; i++) {     
            System.out.print(a[i] + " ");    
        }    
        System.out.println(); 

        // Find the nth smallest element
        if (n >= 1 && n <= size) {
            int nthSmallest = a[n - 1];
            System.out.println("The nth smallest element is: " + nthSmallest);
        } else {
            System.out.println("Invalid value of n. Please enter a value between 1 and " + size + ".");
        }

        // Find the nth largest element
        if (n >= 1 && n <= size) {
            int nthLargest = a[size - n];
            System.out.println("The nth largest element is: " + nthLargest);
        } else {
            System.out.println("Invalid value of n. Please enter a value between 1 and " + size + ".");
        }
    }
}

