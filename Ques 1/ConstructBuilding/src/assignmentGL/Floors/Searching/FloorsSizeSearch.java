package assignmentGL.Floors.Searching;

import java.util.Stack;

import assignmentGL.Floors.Reversing.FloorsSizeRev;

public class FloorsSizeSearch {
	public FloorsSizeSearch() {
		
	}
	
	public static void sizeSearch(int n, Stack <Integer>rev)
	{
		int day = 1;
	    int pos =0;  
	    for (int l=n;l>0;l--) 
	    {
	    	int floor = rev.search(l);
            if(floor < pos)
            { 
                System.out.print(" "+l);
            }
            else
            {     
	            pos = floor;
	            while(day <= floor)
	            {
	                System.out.println("\nDay: "+day);
	                day++;
	            }
	            System.out.print(l);
            }
	     }
	 }

}
