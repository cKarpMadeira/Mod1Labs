package madeira.cs;
import java.util.Scanner;

/**
 * Author: CARINA_KARP
 * Date: 9/8/2020
 **/
public class Lab2 {

    /*
        Comments
        ========
        Excellent work. Well organized code, runs as designed.

        Grade
        =====
        A+ 10/10
     */
    public static void main(String[] args) {
        /*
            Instructions for Use
            ----
            Write a program that does the following
                I. Read your name
                    a. Print a greeting
                II. Read your favorite artist or author
                    a. Print your favorite song or book by that artist
                III. Read your age
                    a. Print the number of days you've been alive (an estimate is fine)
         */
        // Part I code below
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("Hello " + name + "! :)");

        // Part II code below
        System.out.println("What is your favorite artist or author?");
        String author = myScanner.nextLine();
        System.out.println("Your favorite book by " + author + " is I, Robot");

        // Part III code below
        System.out.println("What is your age? (Enter a number)");
        int ageInYears = myScanner.nextInt();
        int ageInDays = ageInYears * 365;
        System.out.println("You have been alive for approximately " + ageInDays + " days!");
    }
}