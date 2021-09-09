package Launcher;

import entity.DJ;
import entity.User;
import helperClasses.HelperUser;

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

        // shows the just saved DJ name
        System.out.println("DJ name is " + dj.getName());

        // creates a break line
        System.out.println();

        // create a temporary Menu and ask which method the user wants to select
        System.out.println("THIS IS A MENU PLEASE SELECT ONE OF THE FOLLOWING METHODS BY TYPING THE NAME"
                + "\nPost a review" + "\nWrite a comment");
        // takes input from the keyboard
        String inputMethodAnswer = input.nextLine();
        //shows the selected method to the user
        System.out.println("Your method is: " + inputMethodAnswer);

        // closes the scanner
        input.close();

    }
}
