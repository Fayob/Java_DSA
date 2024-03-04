package dev.tree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node right;
        Node left;

        private Node(int value) {
            this.value = value;
        }
    }

}
