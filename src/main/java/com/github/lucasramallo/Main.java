package com.github.lucasramallo;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(8);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(2);
        binaryTree.add(10);
        binaryTree.add(11);
        binaryTree.add(9);

        binaryTree.printTree();
    }
}