package entity;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // create a DJ person
        DJ dj = new DJ();

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the DJ's name: ");

        // takes input from the keyboard
        String name = input.nextLine();

        // set DJ name into person created in line 8
        dj.setName(name);

        // closes the scanner
        input.close();

        // shows the just saved DJ name
        System.out.println("DJ name is " + dj.getName());

    }
}
