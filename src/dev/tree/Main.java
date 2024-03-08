package dev.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println(binarySearchTree.insert(47));
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        binarySearchTree.insert(27);

        System.out.println(binarySearchTree.contains(12));
        System.out.println(binarySearchTree.contains(82));

        System.out.println("Root = " + binarySearchTree.root.value);
        System.out.println("Inserted Node = " + binarySearchTree.root.left.right.value);
    }
}
