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

    private void addNode(Node nodeToAdd, Node parentNode) {
        if(nodeToAdd.getValue() < parentNode.getValue()) {
            if (parentNode.getLeft() == null) {
                parentNode.setLeft(nodeToAdd);
                return;
            }

            addNode(nodeToAdd, parentNode.getLeft());
        } else {
            if (parentNode.getRight() == null) {
                parentNode.setRight(nodeToAdd);
                return;
            }

            addNode(nodeToAdd, parentNode.getRight());
        }
    }

    public void removeFirst() {
        if(root.getLeft() == null && root.getRight() != null) {
            root = root.getRight();
            return;
        }

        if(root.getLeft() == null && root.getRight() == null) {
            root = null;
            return;
        }

        removeFirst(root.getLeft(), root);
    }

    private void removeFirst(Node node, Node parentNode) {
        if(node.getLeft() == null) {
            if(node.getRight() == null) {
                parentNode.setLeft(null);
                return;
            }

            parentNode.setLeft(node.getRight());
            return;
        }

        removeFirst(node.getLeft(), parentNode.getLeft());
    }

    public void removeLast() {
        if(root.getRight() == null && root.getRight() != null) {
            root = root.getRight();
            return;
        }

        if(root.getRight() == null && root.getLeft() == null) {
            root = null;
            return;
        }

        removeLast(root.getRight(), root);
    }

    private void removeLast(Node node, Node parentNode) {
        if(node.getRight() == null) {
            if(node.getLeft() == null) {
                parentNode.setRight(null);
                return;
            }

            parentNode.setRight(node.getLeft());
            return;
        }

        removeLast(node.getRight(), parentNode.getRight());
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if(node == null) {
            return false;
        }

        if(node.getValue() == value) {
            return true;
        }

        if(value < node.getValue()) {
            return search(node.getLeft(), value);
        }

        return search(node.getRight(), value);
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
