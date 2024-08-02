package com.github.lucasramallo;

public class BinaryTree {
    private Node root;

    public void add(int value) {
        Node node = new Node(value);

        if(root == null) {
            root = node;
            return;
        }

        addNode(node, root);
    }

    private void addNode(Node nodeToAdd, Node baseNode) {
        if(nodeToAdd.getValue() < baseNode.getValue()) {
            if (baseNode.getLeft() == null) {
                baseNode.setLeft(nodeToAdd);
                return;
            }

            addNode(nodeToAdd, baseNode.getLeft());
        } else {
            if (baseNode.getRight() == null) {
                baseNode.setRight(nodeToAdd);
                return;
            }

            addNode(nodeToAdd, baseNode.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void printTree() {
        printNode(root);
    }

    private void printNode(Node node) {
        if (node != null) {
            String leftValue = (node.getLeft() != null) ? String.valueOf(node.getLeft().getValue()) : "null";
            String rightValue = (node.getRight() != null) ? String.valueOf(node.getRight().getValue()) : "null";
            System.out.println("node: " + node.getValue() + " - left: " + leftValue + ", right: " + rightValue);
            printNode(node.getLeft());
            printNode(node.getRight());
        }
    }
}
