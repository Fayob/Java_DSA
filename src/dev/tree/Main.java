package dev.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println("Root = " + binarySearchTree.root.value);
        System.out.println("Inserted Node = " + binarySearchTree.root.left.right.value);
    }
}
