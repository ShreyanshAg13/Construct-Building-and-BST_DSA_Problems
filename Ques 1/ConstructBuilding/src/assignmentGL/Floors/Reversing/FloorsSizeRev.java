package assignmentGL.Floors.Reversing;

import java.util.*;

import assignmentGL.Floors.Searching.FloorsSizeSearch;

public class FloorsSizeRev {
	public FloorsSizeRev() {
		
	}
	
	public static void sizeRev(int n,Stack <Integer>floor)
	{
	    Stack<Integer>revfloor = new Stack<Integer>();
	    for (int l=n;l>0;l--) 
	    {
            int rev = floor.pop();
            revfloor.push(rev);
	    }
	    FloorsSizeSearch.sizeSearch(n,revfloor);    
	}

}
