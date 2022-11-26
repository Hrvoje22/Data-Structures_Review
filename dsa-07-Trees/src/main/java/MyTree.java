public class MyTree {

    TNode root;

    public MyTree() {
    }

    //Insert tree
    void insert(int value){
        TNode newNode = new TNode(value);
        if(root == null){
            root=newNode;
            return;
        }

        TNode current = root;
        while(true){
            if(value<= current.value){
                if(current.leftChild==null){
                    //if left is null insert there
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }
            else{
                if(current.rightChild==null){
                    //if right is null insert there
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }
        }
    }

    //PreOrder Traversal of the tree
    //Root - Left - Right
    void preOrderTraversal(TNode root){

        if(root==null) return;

        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);

    }

    //InOrder Traversal of the tree
    //Left - Root - Right
    //Ascending order - if it's a binary search tree
    void inOrderTraversal(TNode root){
        if(root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    //PostOrder Traversal of the tree
    //Left - Right - Root
    void postOrderTraversal(TNode root){
        if(root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }




}
