
Um bom nome para a classe que será responsável por imprimir a árvore binária pode ser BinaryTreePrinter. Este nome deixa claro que a função principal da classe é imprimir uma árvore binária.

        Aqui está como você poderia implementar essa classe:

        java
        Copy code
        package com.github.lucasramallo;

public class BinaryTree {
    private Node root;

    public void add(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        addNode(node, root);
    }

    private void addNode(Node nodeToAdd, Node baseNode) {
        if (nodeToAdd.getValue() < baseNode.getValue()) {
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

    // Classe Node
    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}

package com.github.lucasramallo;

public class BinaryTreePrinter {

    public static void printTree(BinaryTree tree) {
        if (tree == null || tree.getRoot() == null) {
            System.out.println("The tree is empty.");
            return;
        }
        printSubtree(tree.getRoot(), 0);
    }

    private static void printSubtree(BinaryTree.Node node, int depth) {
        if (node == null) {
            printIndent(depth);
            System.out.println("null");
            return;
        }

        printSubtree(node.getRight(), depth + 1);
        printIndent(depth);
        System.out.println(node.getValue());
        printSubtree(node.getLeft(), depth + 1);
    }

    private static void printIndent(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
    }

    // Main para teste
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);

        BinaryTreePrinter.printTree(tree);
    }
}