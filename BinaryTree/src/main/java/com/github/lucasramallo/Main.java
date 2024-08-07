package com.github.lucasramallo;

import com.github.lucasramallo.util.Printer;

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
        binaryTree.add(6);
        binaryTree.add(1);
        binaryTree.add(10);


        Printer.printTree(binaryTree);
        System.out.println();

//        binaryTree.removeFirst();
        binaryTree.removeLast();
        Printer.printTree(binaryTree);
    }
}