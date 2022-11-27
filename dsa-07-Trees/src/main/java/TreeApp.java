public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root,null,false);

//        System.out.println("Pre Order Traversal: ");
//        tree.preOrderTraversal(tree.root);
//        System.out.println("\nIn Order Traversal: ");
//        tree.inOrderTraversal(tree.root);
//        System.out.println("\nPost Order Traversal: ");
//        tree.postOrderTraversal(tree.root);
//        System.out.println("\nLevel Order Traversal: ");
//        tree.levelOrderTraversal();

        System.out.println(tree.contains(8));
        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("Number of leaves: " + tree.countLeaves(tree.root));
        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));
        System.out.println("Height of this Tree is : " + tree.height(tree.root));


        System.out.println("Sum of Node Depths is: " + tree.calculateNodeDepthsSums());
        System.out.println("Sum of all node values is: " + tree.calculateNodeSums());


    }
}
