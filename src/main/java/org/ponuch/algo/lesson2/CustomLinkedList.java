package org.ponuch.algo.lesson2;

public class CustomLinkedList <T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void insert(T data) {
        var new_node = new Node<T>(data);

        if(this.head == null) {
            this.head = new_node;
        }
        else {
            var last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList() {
        var currentNode = this.head;

        System.out.print("LinkedList: ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    /**
     * Астрологи объявили неделю удвоения чётных чисел
     */
    public void doubleNumbers() {
        var currentNode = this.head;

        System.out.print("LinkedList: ");

        while (currentNode != null) {
            if (currentNode.data instanceof Integer cur_data) {
                var nextNode = currentNode.next;
                if (cur_data % 2 == 0 && currentNode.next != null) {

                    currentNode.next = new Node<>(currentNode.data);
                    currentNode.next.next = nextNode;
                }
                currentNode = nextNode;
            }
        }
    }

    public CustomLinkedList<T> getNegativeNumbers() {
        var list = new CustomLinkedList<T>();
        var currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data instanceof Integer cur_data) {
                if (cur_data < 0) {
                    list.insert(currentNode.data);
                }
            }
            currentNode = currentNode.next;
        }
        return list;
    }

    public CustomLinkedList<T> getPositiveNumbers() {
        var list = new CustomLinkedList<T>();
        var currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data instanceof Integer cur_data) {
                if (cur_data >= 0) {
                    list.insert(currentNode.data);
                }
            }
            currentNode = currentNode.next;
        }
        return list;
    }

    /**
     * Разворот списка
     */

    public void reverse() {
        Node<T> previous = null;
        var current = this.head;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }
}
