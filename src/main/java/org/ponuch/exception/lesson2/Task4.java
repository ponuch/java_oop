package org.ponuch.exception.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character ch;

        do {
            System.out.println("Input line");
            try {
                var line = scan.nextLine();
                if(line.isEmpty()) {
                    throw new EmptyLineException("Empty line not allowed");
                }
            }
            catch (EmptyLineException ex) {
                System.out.println(ex.getMessage());
            }
            catch (Exception ex) {
                System.out.println(ex);
            }

            System.out.println("\nFor exit press n");
            ch = scan.next().charAt(0);
        } while (ch.compareTo('n') != 0);
    }
}
