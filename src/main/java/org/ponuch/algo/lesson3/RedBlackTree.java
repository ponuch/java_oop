package org.ponuch.algo.lesson3;

public class RedBlackTree {

    private Node root;
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    public boolean insert(int data) {
        Node n = add(data);
        if (root == null) {
            root = n;
        }
        balance(n);
        return true;
    }

    private Node add(int data) {
        Node x = root;
        Node y = null;
        Node n = new Node(data);
        while (x != null) {
            y = x;
            if (x.data > data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        if (y == null) {
            y = n;
        } else if (y.data > data) {
            n.parent = y;
            y.left = n;
        } else {
            n.parent = y;
            y.right = n;
        }
        return n;
    }


    private void balance(Node node) {
        node.color = RED;

        while (node != null && node != root && node.parent.color == RED) {
            if (parentOf(node) == leftOf(parentOf(parentOf(node)))) {
                Node y = rightOf(parentOf(parentOf(node)));
                if (colorOf(y) == RED) {
                    // we do color flip.
                    setColor(parentOf(node), BLACK);
                    setColor(parentOf(parentOf(node)), RED);
                    setColor(y, BLACK);
                    node = parentOf(parentOf(node));
                } else {
                    if (rightOf(parentOf(node)) == node) {
                        node = parentOf(node);
                        leftRotate(parentOf(node));

                    }
                    setColor(parentOf(node), BLACK);
                    setColor(parentOf(parentOf(node)), RED);
                    rightRotate(parentOf(parentOf((node))));
                }
            } else {

                Node y = leftOf(parentOf(parentOf(node)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(node), BLACK);
                    setColor(parentOf(parentOf(node)), RED);
                    setColor(y, BLACK);
                    node = parentOf(parentOf(node));
                } else {
                    if (leftOf(parentOf(node)) == node) {
                        node = parentOf(node);
                        rightRotate(parentOf(node));

                    }
                    setColor(parentOf(node), BLACK);
                    setColor(parentOf(parentOf(node)), RED);
                    leftRotate(parentOf(parentOf((node))));
                }
            }
        }

        root.color = BLACK;
    }

    private boolean colorOf(Node node) {
        return node != null ? node.color : BLACK;
    }

    private Node leftOf(Node node) {
        return node != null ? node.left : null;
    }

    private Node rightOf(Node node) {
        return node != null ? node.right : null;
    }

    private Node parentOf(Node node) {
        return node != null ? node.parent : null;
    }

    private void setColor(Node node, boolean color) {
        if (node != null) {
            node.color = color;
        }
    }

    private void leftRotate(Node node) {
        if (node != null) {
            Node temp = node.right;
            node.right = temp.left;
            if (leftOf(temp) != null) {
                temp.left.parent = node;
            }
            temp.parent = node.parent;
            if (parentOf(node) == null) {
                root = temp;
            } else if (leftOf(parentOf(node)) == node) {
                node.parent.left = temp;
            } else {
                node.parent.right = temp;
            }
            temp.left = node;
            node.parent = temp;
        }
    }

    private void rightRotate(Node node) {
        if (node != null) {
            Node temp = node.left;
            node.left = temp.right;

            if (rightOf(temp) != null) {
                temp.right.parent = node;
            }
            temp.parent = node.parent;
            if (parentOf(node) == null) {
                root = temp;
            } else if (rightOf(parentOf(node)) == node) {
                node.parent.right = temp;
            } else {
                node.parent.left = temp;
            }
            temp.right = node;
            node.parent = temp;

        }
    }


    public static class Node {
        Node left, right, parent;
        int data;
        boolean color;

        public Node(int data) {
            this.data = data;
        }
    }
}
