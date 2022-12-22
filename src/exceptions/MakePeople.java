package exceptions;

import java.util.Scanner;

public class MakePeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // can't construct a CheckedPerson without a try/catch around it!
        try {
            System.out.print("Enter an age: ");
            int age = input.nextInt();
            CheckedPerson cp = new CheckedPerson("Some Dude", age);
        } catch (AgeException e) {
            System.out.println(e);
        }

        // but a regular person will just throw a RuntimeException.
        System.out.print("Enter an age: ");
        int age = input.nextInt();
        Person2 p = new Person2("Another Person", age);

        // if the previous constructor fails, we will never get here.
        System.out.print("Enter an age: ");
        age = input.nextInt();
        Person2 adult = new Person2("Bob", 25);
    }

}