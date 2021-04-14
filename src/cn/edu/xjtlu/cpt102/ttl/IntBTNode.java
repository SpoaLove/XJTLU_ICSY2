package cn.edu.xjtlu.cpt102.ttl;


public class IntBTNode {

    int data;
    IntBTNode left;
    IntBTNode right;

    public IntBTNode(int initialData, IntBTNode initialLeft, IntBTNode initialRight) {
        data = initialData;
        left = initialLeft;
        right = initialRight;
    }

    public IntBTNode(int initialData) {
        data = initialData;
        left = null;
        right = null;
    }

    /**
     * Accessor method to get the data from the leftmost node of the tree below
     * this node.
     * @return the data from the deepest node that can be reached from this node
     * by following left links.
     */
    public int getLeftmostData() {
        if (left == null) {
            return data;
        } else {
            return left.getLeftmostData();
        }
    }

    /**
     * Accessor method to get the data from the rightmost node of the tree below
     * this node.
     * @return the data from the deepest node that can be reached from this node
     * by following right links.
     */
    public int getRightmostData() {
        if (right == null) {
            return data;
        } else {
            return right.getRightmostData();
        }
    }
    
    /**
     * Accessor method to determine whether a node is a leaf.
     * @return <CODE>true</CODE> (if this node is a leaf) or <CODE>false</CODE>
     * (if this node is not a leaf.
     */
    public boolean isLeaf() {
        return (left == null) && (right == null);
    }

    /**
     * Uses an inorder traversal to print the data from each node at or below
     * this node of the binary tree.
     */
    public void inorderPrint() {
        if (left != null) {
            left.inorderPrint();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.inorderPrint();
        }
    }

    /**
     * Uses a preorder traversal to print the data from each node at or below
     * this node of the binary tree.
     */
    public void preorderPrint() {
        System.out.print(data + " ");
        if (left != null) {
            left.preorderPrint();
        }
        if (right != null) {
            right.preorderPrint();
        }
    }

    /**
     * Uses a postorder traversal to print the data from each node at or below
     * this node of the binary tree.
     */
    public void postorderPrint() {
        if (left != null) {
            left.postorderPrint();
        }
        if (right != null) {
            right.postorderPrint();
        }
        System.out.print(data + " ");
    }

    /**
     * Uses an inorder traversal to print the data from each node at or below
     * this node of the binary tree, with indentations to indicate the depth of
     * each node.
     *
     * @param depth the depth of this node (with 0 for root, 1 for the root's
     * children, and so on)(
     * <b>Precondition:</b>
     * <CODE>depth</CODE> is the depth of this node.
     * <b>Postcondition:</b>
     * The data of this node and all its descendants have been writeen by
     * <CODE>System.out.println( )</CODE> using an inorder traversal. The
     * indentation of each line of data is four times its depth in the tree. A
     * dash "--" is printed at any place where a child has no sibling.
*
     */
    public void print(int depth) {
        int i;

        // Print the indentation and the data from the current node:
        for (i = 1; i <= depth; i++) {
            System.out.print("    ");
        }
        System.out.println(data);

        // Print the left subtree (or a dash if there is a right child and no left child)   
        if (left != null) {
            left.print(depth + 1);
        } else if (right != null) {
            for (i = 1; i <= depth + 1; i++) {
                System.out.print("    ");
            }
            System.out.println("--");
        }

        // Print the right subtree (or a dash if there is a left child and no left child)  
        if (right != null) {
            right.print(depth + 1);
        } else if (left != null) {
            for (i = 1; i <= depth + 1; i++) {
                System.out.print("    ");
            }
            System.out.println("--");
        }
    }



    /**
     * Copy a binary tree.
     *
     * @param source a reference to the root of a binary tree that will be
     * copied (which may be an empty tree where <CODE>source</CODE> is null)
     * @return The method has made a copy of the binary tree starting at
     * <CODE>source</CODE>. The return value is a reference to the root of the
     * copy.
     * @exception OutOfMemoryError Indicates that there is insufficient memory
     * for the new tree.   
     */
    public static IntBTNode treeCopy(IntBTNode source) {
        IntBTNode leftCopy;
        IntBTNode rightCopy;
        if (source == null) {
            return null;
        } else {
            leftCopy = treeCopy(source.left);
            rightCopy = treeCopy(source.right);
            return new IntBTNode(source.data, leftCopy, rightCopy);
        }
    }

    /**
     * Count the number of nodes in a binary tree.
     *
     * @param root a reference to the root of a binary tree (which may be an
     * empty tree where <CODE>source</CODE> is null)
     * @return the number of nodes in the binary tree
     * <b>Note:</b>
     * A wrong answer occurs for trees larger than <CODE>INT.MAX_VALUE</CODE>.    
     */
    public static int treeSize(IntBTNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + treeSize(root.left) + treeSize(root.right);
        }
    }

}
