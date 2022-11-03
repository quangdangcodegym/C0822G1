public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(9);
        tree.insert(6);
        tree.insert(8);
        tree.insert(3);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}