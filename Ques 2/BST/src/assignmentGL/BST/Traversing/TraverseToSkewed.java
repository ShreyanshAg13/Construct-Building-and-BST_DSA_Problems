package assignmentGL.BST.Traversing;

import assignmentGL.BST.Node.*;

public class TraverseToSkewed {
	
	public TraverseToSkewed() {
		
	}
	
	public static void traverseToSkewed(Node root)
	{
		if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseToSkewed(root.right);  
	}
}
