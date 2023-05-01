package org.ponuch.algo.lesson2;

public class ReverseCustomLinkedList {
    public static void main(String[] args) {
        var linkedList = new CustomLinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(8);
        linkedList.insert(-56);
        linkedList.insert(123);
        linkedList.insert(76);
        linkedList.insert(4);
        linkedList.insert(67);

        linkedList.printList();
        System.out.println();
        linkedList.doubleNumbers();
        linkedList.printList();
        System.out.println();
        linkedList.reverse();
        linkedList.printList();

        var negativeList = linkedList.getNegativeNumbers();
        var positiveList = linkedList.getPositiveNumbers();

        negativeList.printList();
        System.out.println();
        positiveList.printList();
    }
}
