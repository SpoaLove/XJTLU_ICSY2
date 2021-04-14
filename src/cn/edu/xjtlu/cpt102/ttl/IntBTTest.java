package cn.edu.xjtlu.cpt102.ttl;

public class IntBTTest {

    public static void main(String[] args) {
        
        /* Creating object of BT */
        IntBST tree = new IntBST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(10);

        /**
         *        5
         *     3     7
         *    2 4   6 8
         *   1
         */

        /**
         *        5
         *     3     7
         *    2 4   6 8
         *   1
         */

        /*  Display tree  */
        System.out.print("\nPost order : ");
        tree.postorder();
        System.out.print("\nPre order : ");
        tree.preorder();
        System.out.print("\nIn order : ");
        tree.inorder();
        System.out.println();
             
        System.out.println(tree.search(30));
        System.out.println(tree.search(90));
        
        tree.printRange(30, 60);
        System.out.println();
        tree.delete(30);
        tree.root.print(1);
        
        tree.kthLargest(1);
        tree.kthLargest(2);
        tree.kthLargest(3);
        tree.kthLargest(4);
        tree.kthLargest(5);
        
    }
}
