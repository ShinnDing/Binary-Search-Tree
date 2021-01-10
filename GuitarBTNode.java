
/**
 * 
 * @author Stephanie Shinn
 * 
 * This entire GuitarBTNode class was adapted from BTNode.java found at
 *    Code adapted from https://www.cs.colorado.edu/~main/edu/colorado/nodes/BTNode.java
 *
 */
public class GuitarBTNode {

	private Guitar data;
	private GuitarBTNode left, right;

	public GuitarBTNode(Guitar initialData, GuitarBTNode initialLeft, GuitarBTNode initialRight) {
		data = initialData;
		left = initialLeft;
		right = initialRight;
	}

	/**
	 * Accessor method to get the data from this node.
	 * 
	 * @return the data from this node
	 **/
	public Guitar getData() {
		return data;
	}

	/**
	 * Accessor method to get a reference to the left child of this node.
	 * 
	 * @return a reference to the left child of this node (or the null reference if
	 *         there is no left child)
	 **/
	public GuitarBTNode getLeft() {
		return left;
	}

	/**
	 * Accessor method to get the data from the leftmost node of the tree below this
	 * node.
	 * 
	 * @return the data from the deepest node that can be reached from this node by
	 *         following left links.
	 **/
	public Guitar getLeftmostData() {
		if (left == null)
			return data;
		else
			return left.getLeftmostData();
	}

	/**
	 * Accessor method to get a reference to the right child of this node.
	 * 
	 * @return a reference to the right child of this node (or the null reference if
	 *         there is no right child)
	 **/
	public GuitarBTNode getRight() {
		return right;
	}

	/**
	 * Accessor method to get the data from the rightmost node of the tree below
	 * this node.
	 * 
	 * @return the data from the deepest node that can be reached from this node by
	 *         following right links.
	 **/
	public Guitar getRightmostData() {
		if (left == null)
			return data;
		else
			return left.getRightmostData();
	}

	public void setLeft(GuitarBTNode guitarBTNode) {
		// TODO Auto-generated method stub
		left = guitarBTNode;	
	}

	public void setRight(GuitarBTNode guitarBTNode) {
		// TODO Auto-generated method stub
		right = guitarBTNode;
	}
	
	   /**
	   * Accessor method to determine whether a node is a leaf. 
	   * @return
	   *   <CODE>true</CODE> (if this node is a leaf) or 
	   *   <CODE>false</CODE> (if this node is not a leaf.
	   **/
	public boolean isLeaf() {
		return (left == null) && (right == null);
	}
}
