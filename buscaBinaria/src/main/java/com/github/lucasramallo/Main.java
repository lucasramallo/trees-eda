package com.github.lucasramallo;

import com.github.lucasramallo.util.Printer;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

//        binaryTree.add(8);
//        binaryTree.add(5);
//        binaryTree.add(7);
//        binaryTree.add(2);
//        binaryTree.add(10);
//        binaryTree.add(11);
//        binaryTree.add(9);
//        binaryTree.add(6);
//        binaryTree.add(1);
//        binaryTree.add(10);


        binaryTree.add(61);
        binaryTree.add(43);
        binaryTree.add(89);
        binaryTree.add(66);
        binaryTree.add(51);
        binaryTree.add(16);
        binaryTree.add(55);
        binaryTree.add(11);
        binaryTree.add(79);
        binaryTree.add(77);
        binaryTree.add(82);
        binaryTree.add(32);

        System.out.println(binaryTree.search(32));
        Printer.printTree(binaryTree);
    }
}