package grp_ass_2;

import java.util.Scanner;
import java.util.Stack;


public class arc_grp_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter the total number of floors in the building");
	        int n = scanner.nextInt();

	        
	        int[] fSizes = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter the floor size given on day " + (i + 1));
	            fSizes[i] = scanner.nextInt();
	        }

	      
	        constructSkyscraper(n, fSizes);

	        scanner.close();
	    }

	    private static void constructSkyscraper(int n, int[] fSizes) {
	        Stack<Integer> fStack = new Stack<>();

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nDay: " + (i + 1));

	           
	            while (!fStack.isEmpty() && fSizes[i] > fStack.peek()) {
	                System.out.print(fStack.pop() + " ");
	            }

	           
	            fStack.push(fSizes[i]);

	         
	            for (int f : fStack) {
	                System.out.print(f + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	


