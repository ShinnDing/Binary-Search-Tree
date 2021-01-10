
/**
 * 
 * @author Stephanie Shinn
 * 
 * [GuitarCollection is a Binary Search Tree modeled after methods found at 
 *   https://www.cs.colorado.edu/~main/edu/colorado/nodes/BTNode.java,
 *   Chapter 9 of "DATA STRUCTURES & Other Objects Using JAVA" by
 *   author Michael Main, and "Introduction to Data Structures" class PowerPoint slides.
 *   Assistance was also received from the Tutoring Center.]
 *   
 *  
 * 
 * INVARIANT for the GuitarCollection:
 * 
 * 	1. The elements in the bag are stored in a binary search tree.
 *  2. The instance variable root is a reference to the root of the
 *     binary search tree (or null for an empty tree).
 *  3. The left child is always less than or equal to the parent.
 *  4. The right child is always greater than the parent.
 *     
 * This class:
 * 
 *     - inserts a new Guitar in the tree in the correct position, 
 *       preserving the properties of a binary search tree
 *     - traverses the Tree (collection) in pre-order (based on the search key) and displays the contents
 *       of each Node
 *     - traverses the Tree (collection) in post-order (based on the search key) and displays the
 *       contents of each Node
 *     - traverses the Tree (collection) in in-order (based on the search key) and displays the
 *       contents of each Node
 *     - calculates the depth of the Tree (collection)
 *     - calculates the number of Nodes in the Tree (collection)
 *     - traverses the Tree (collection) and searches for a reference to a Guitar matching the item's search key
 *
 */
public class GuitarCollection {

	private GuitarBTNode root;

	public GuitarCollection() {

		root = null;
	}

	/**
	 * 
	 * add(Guitar t) adds a Guitar to the root if it is null or, if the root is
	 *    not null, it calls the helper method add (GuitarBTNode cursor, Guitar t)
	 *    to insert the tree in the appropriate position.
	 *    This method was adapted from PowerPoint presentation "12-F Implementing a Linked List,"
	 *    slide 13.
	 * 
	 * @param t represent the Guitar to be added to the Tree (collection).
	 * 
	 */
	public void add(Guitar t) {

		if (root == null) {
			root = new GuitarBTNode(t, null, null);
		} else {
			add(root, t);
		}
	}

	/**
	 * 
	 * add(GuitarBTNode cursor, Guitar t) is a helper method.
	 *    It adds a node to the tree in the correct location, depending on the value of data.
	 *	  This method was adapted from PowerPoint presentation "12-F Implementing a Linked List,"
	 *    slide 16.
	 * 
	 * @param cursor represents the root node of the Binary Search Tree (collection).
	 *    It is used to traverse through the Tree (collection) to add the Guitar to the
	 *    correct location.
	 * @param t represents the Guitar to be added to the Tree (collection).
	 */
	private void add(GuitarBTNode cursor, Guitar t) {

		if (t.compareTo(cursor.getData()) <= 0) {
			if (cursor.getLeft() != null) {
				add(cursor.getLeft(), t);
			} else {
				cursor.setLeft(new GuitarBTNode(t, null, null));
			}
		}
		if (t.compareTo(cursor.getData()) > 0) {
			if (cursor.getRight() != null) {
				add(cursor.getRight(), t);
			} else {
				cursor.setRight(new GuitarBTNode(t, null, null));
			}
		}
	}
	
	/**
	 * 
	 * preorder() calls the preorderPrint(root) helper method to print the Tree (collection)
	 *    in pre-order.
	 * 
	 */
	public void preorder() {
		if (root == null) {
			System.out.println("The collection is empty.  Buy guitars.");
		} else {
			System.out.println("\n\t\t\t    ~~~~~~~~~~~~~~~");
			System.out.println("\t\t\t    |  PRE-ORDER  |");
			System.out.println("\t\t\t    ~~~~~~~~~~~~~~~");
			System.out.println("\n\t\tBrand\t\tWeight\t\tYear\n\t\t------------------------------------");
			preorderPrint(root);
		}
	}

	/**
	 * preorderPrint(GuitarBTNode cursor) is a helper method that uses a preorder traversal
	 *    to identify each node, one at a time, in pre-order.  This helper method is called by
	 *    the preorder() method to print each node in pre-order.
	 *    
	 *    This method was adapted from the BTNode class found at 
	 *    https://www.cs.colorado.edu/~main/edu/colorado/nodes/BTNode.java
	 * 
	 **/
	private void preorderPrint(GuitarBTNode cursor) {
		System.out.println(cursor.getData());
		if (cursor.getLeft() != null)
			preorderPrint(cursor.getLeft());
		if (cursor.getRight() != null)
			preorderPrint(cursor.getRight());
	}

	/**
	 * 
	 * postorder() calls the postorderPrint(root) helper method to print the Tree (collection)
	 *    in post-order.
	 * 
	 */
	public void postorder() {
		if (root == null) {
			System.out.println("The collection is empty.  Buy guitars.");
		} else {
			System.out.println("\n\t\t\t   ~~~~~~~~~~~~~~~~");
			System.out.println("\t\t\t   |  POST-ORDER  |");
			System.out.println("\t\t\t   ~~~~~~~~~~~~~~~~");
			System.out.println("\n\t\tBrand\t\tWeight\t\tYear\n\t\t------------------------------------");
			postorderPrint(root);
		}

	}

	/**
	 * postorderPrint(GuitarBTNode cursor) is a helper method that uses a postorder traversal
	 *    to identify each node, one at a time, in post-order.  This helper method is called by
	 *    the postorder() method to print each node in post-order.
	 *    
	 *    This method was adapted from the BTNode class found at 
	 *    https://www.cs.colorado.edu/~main/edu/colorado/nodes/BTNode.java
	 * 
	 **/
	private void postorderPrint(GuitarBTNode cursor) {
		if (cursor.getLeft() != null)
			postorderPrint(cursor.getLeft());
		if (cursor.getRight() != null)
			postorderPrint(cursor.getRight());
		System.out.println(cursor.getData());
	}

	/**
	 * 
	 * inorder() calls the inorderPrint(root) helper method to print the Tree (collection)
	 *    in in-order.
	 * 
	 */
	public void inorder() {

		if (root == null) {
			System.out.println("The collection is empty.  Buy guitars.");
		} else {
			System.out.println("\n\t\t\t     ~~~~~~~~~~~~~~");
			System.out.println("\t\t\t     |  IN-ORDER  |");
			System.out.println("\t\t\t     ~~~~~~~~~~~~~~");
			System.out.println("\n\t\tBrand\t\tWeight\t\tYear\n\t\t------------------------------------");
			inorderPrint(root);
		}
	}

	/**
	 * inorderPrint(GuitarBTNode cursor) is a helper method that uses an in-order traversal
	 *    to identify each node, one at a time, in in-order.  This helper method is called by
	 *    the inorder() method to print each node in in-order.
	 *    
	 *    This method was adapted from the BTNode class found at 
	 *    https://www.cs.colorado.edu/~main/edu/colorado/nodes/BTNode.java
	 * 
	 **/
	private void inorderPrint(GuitarBTNode cursor) {
		if (cursor.getLeft() != null)
			inorderPrint(cursor.getLeft());
		System.out.println(cursor.getData());
		if (cursor.getRight() != null)
			inorderPrint(cursor.getRight());
	}

	/**
	 * 
	 * depth() calls helper method depth(GuitarBTNode cursor) to 
	 *    determine the depth of the Tree (collection)
	 * 
	 * @return returns 1 less than the value of depth(GuitarBTNode cursor),
	 *    which represents the depth of the Tree (collection).
	 */
	public int depth() {
		return depth(root);
	}

	/**
	 * 
	 * depth(GuitarBTNode cursor) is a helper method that traverses the
	 *    Tree (collection) and returns max nodes plus 1.
	 * 
	 *    This method was adapted from
	 *    https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
	 *    
	 * @param cursor represents the root node of the Binary Search Tree (collection).
	 *    It is used to traverse through the Tree (collection) to count the levels of
	 *    branches.
	 *    
	 * @return returns the depth (branch level) plus 1.
	 * 
	 */
	private int depth(GuitarBTNode cursor) {

		if (cursor == null) {
			return -1;
		}
		if (depth(cursor.getLeft()) > depth(cursor.getRight())) {
			return 1 + depth(cursor.getLeft());
		} else {
			return 1 + depth(cursor.getRight());
		}
	}

	/**
	 * 
	 * count() calls helper method count(GuitarBTNode cursor), which
	 *    determines the number of Nodes (Guitars) in
	 *    the Tree (collection).
	 *    
	 *    The method was adapted from PowerPoint 12-F, Slide 12.
	 *    
	 * @return returns the value from count(GuitarBTNode cursor)
	 * 
	 */
	public int count() {
		return count(root);
	}

	/**
	 * 
	 * count(GuitarBTNode cursor) is a helper method that traverses the Tree
	 *    (collection) and returns the number of Nodes (guitars) in the Tree
	 *    (collection).
	 *    
	 *    The method was adapted from PowerPoint 12-F, Slide 12.
	 *    
	 * @param cursor represents the root node of the Binary Search Tree (collection).
	 *    It is used to traverse through the Tree (collection) to count the number of
	 *    Nodes (guitars) in the Tree (collection).
	 *    
	 * @return returns the number of Nodes (guitars) in the Tree (collection).
	 */
	private int count(GuitarBTNode cursor) {
		if (cursor == null) {
			return 0;
		}
		return 1 + count(cursor.getLeft()) + count(cursor.getRight());
	}

	/**
	 * 
	 * search(Guitar item) calls the helper method search(Guitar item, GuitarBTNode cursor)
	 *    that traverses the Tree (collection) and returns the details of the guitar that
	 *    matches the search key (brand).
	 *    
	 * @param item is the search key used to find the details of the matching guitar brand.
	 * 
	 * @return returns the guitar details matching the search key (brand).
	 */
	public Guitar search(Guitar item) {
		
		return search(item, root);
	}

	/**
	 * 
	 * search(Guitar item, GuitarBTNode cursor) is a helper method that traverses
	 *    the Tree (collection).
	 * 
	 * @param item is the search key (brand) used to find the matching guitar in
	 *    the Tree (collection.
	 * @param cursor represents the root node of the Binary Search Tree (collection).
	 *    It is used to traverse through the Tree (collection) to check each guitar to
	 *    see if it is a match with the search key (brand).
	 * @return returns the matching guitar and its details.
	 */
	private Guitar search(Guitar item, GuitarBTNode cursor) {
		
		if (cursor == null) {
			return null;
		}
		int comparison = item.compareTo(cursor.getData());
		if (comparison == 0) {
			return cursor.getData();
		} else if (comparison < 0) {
			return search(item, cursor.getLeft());
		} else {
			return search(item, cursor.getRight());
		}
	}
}