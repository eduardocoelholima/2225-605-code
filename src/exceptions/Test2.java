package exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Test2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int age = -1;
            System.out.print("How old are you? ");
            while (age < 0) {
                try {
                    age = in.nextInt();
                    if (age < 0) {
                        System.out.println("Umm, positive number, please.");
                    } else if (age >= 67) {
                        System.out.println("Time to retire...");
                    } else {
                        System.out.println("Keep working...");
                    }
                } catch (InputMismatchException err) {
                    System.out.print("Wrong kind of value. ");
                    System.out.println("We need an integer.");
                }
                if (age < 0) {
                    String dummy = in.nextLine(); // Skip this bogus entry.
                    System.out.print("How old are you? ");
                }
            }
        } catch (NoSuchElementException nsee) {
            System.out.println("You quit. How rude!");
        }
        System.out.println("Done...");
    }
}
