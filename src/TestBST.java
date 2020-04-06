public class TestBST {
    public static void main(String[] args) {

        BST<Integer> tree = new BST<>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(10);
        tree.insert(8);
        tree.insert(9);
        tree.insert(8);
        System.out.println("\nInorder (sorted): ");
        tree.inorder();

        System.out.println("\nPreOrder : ");
        tree.preOrder();

        System.out.println("\nPostOrder : ");
        tree.postOrder();

        System.out.println("\n"+5 + " in tree?"+tree.search(5));
        System.out.println(8 + " in tree?"+tree.search(8));
        System.out.println(0 + " in tree?"+tree.search(0));
        System.out.println(1 + " in tree?"+tree.search(1));

//        tree.delete(3);
//        tree.postOrder();
    }
}
