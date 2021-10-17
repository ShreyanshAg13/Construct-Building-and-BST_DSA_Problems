package assignmentGL.BST.Node;

public class Node 
{
	public int val;
    public Node left;
	public Node right;
	
	public static Node node;
    public static Node prevNode = null;
    public static Node headNode = null;
	  
	public Node(int i) 
	{
		val = i;
        left = right = null;
	}
	
	public Node() {
		
	}
}
