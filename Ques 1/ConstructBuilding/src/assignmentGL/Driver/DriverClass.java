package assignmentGL.Driver;

import java.util.Scanner;
import java.util.Stack;

import assignmentGL.Floors.Reversing.FloorsSizeRev;

public class DriverClass {
	
	public static void main (String[] args)
	{
	    Scanner sc  = new Scanner(System.in);
	    System.out.print("Enter the total no. of floors in the building: ");
	    int n = sc.nextInt();
	    Stack<Integer>floors = new Stack<Integer>();
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter the floor size given on day : " + (i+1));
	        floors.push(sc.nextInt());
	    }
	    FloorsSizeRev.sizeRev(n,floors);	    
	} 

}
