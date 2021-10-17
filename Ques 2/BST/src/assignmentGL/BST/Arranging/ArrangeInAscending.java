package assignmentGL.BST.Arranging;

import assignmentGL.BST.Node.*;

public class ArrangeInAscending {
	
	public static void arrangeInAscending(Node root)
	{
		if(root == null)
        {
            return;
        }
       
        arrangeInAscending(root.left);
        Node rightNode = root.right;
        Node leftNode = root.left;
 
        if(Node.headNode == null)
        {
            Node.headNode = root;
            root.left = null;
            Node.prevNode = root;
        }
        else
        {
            Node.prevNode.right = root;
            root.left = null;
            Node.prevNode = root;
        }
  
        arrangeInAscending(rightNode);
	}

}
