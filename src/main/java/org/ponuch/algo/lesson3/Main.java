package org.ponuch.algo.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        Scanner scan = new Scanner(System.in);

        Character ch;
        do {
            System.out.println("Input int number");

            int data = scan.nextInt();
            tree.insert(data);
            System.out.println("\nFor continue press y");
            ch = scan.next().charAt(0);
        } while (ch.compareTo('y') == 0);
    }
}
