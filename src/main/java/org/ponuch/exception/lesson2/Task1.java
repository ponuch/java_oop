package org.ponuch.exception.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Character ch;

        do {
            System.out.println("Input float number");
            try {
                if(scan.hasNextFloat()) {
                    float data = scan.nextFloat();
                    System.out.println("Data = " + data);
                }
            }
            catch (Exception ex) {
                System.out.println(ex);
            }

            System.out.println("\nFor exit press n");
            ch = scan.next().charAt(0);
        } while (ch.compareTo('n') != 0);
    }
}
