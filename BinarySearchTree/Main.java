package com.bridgelabz.Day15.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(56);
        tree.add(30);
        tree.add(70);
        tree.add(65);
        tree.add(62);
        tree.add(20);
        tree.add(60);
        tree.displayTree();
        tree.search(63);

    }
}
