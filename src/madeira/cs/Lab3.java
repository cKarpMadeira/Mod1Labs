package madeira.cs;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab3 {
    public static void main(String[] args) {
	 /*
           Instructions For Use
           ------
           Write a program that does the following
           I. Reads the user's age and prints if they're permitted to:
              a. Drive
	           b. Get a tattoo
              c. Run for President of the United States
           II. Reads the user's birthday month and prints:
              a. Their astrological sign
	      b. The season of said month
              c. The number of days in the month
           III. Prints the estimated value of their age in days.
       */

        // Part I code below
        //feat. actual error handling this time!
        Scanner s = new Scanner(System.in);
        //java got upset when i didn't initialize age so it's just 0 for now
        int age = 0;
        Boolean validAge = false;
        System.out.println("Enter your age as a number: ");
        //repeat until user enters valid age
        while (!s.hasNextInt()) {
            s.nextLine(); //clear the invalid input before prompting again
            System.out.print("Invalid entry, try again ");
        }
        age = s.nextInt();
        //test for driving
        if (age >= 16) {
            System.out.println("You are permitted to drive!");
        } else {
            System.out.println("You are not permitted to drive yet.");
        }
        //test for tattoo
        if (age >= 18) {
            System.out.println("You are permitted to get a tattoo!");
        } else {
            System.out.println("You need parental consent to get a tattoo.");
        }
        //test for run for president
        if (age >= 35) {
            System.out.println("You are old enough to run for president!");
        } else {
            System.out.println("You are not old enough to run for president.");
        }

        // Part II code below
        //define and initialize variables and arrays
        String birthMonth = "it's initialized stop complaining";
        String months[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        String signs[] = {"Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"};
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //i'm making the months array a list not bc i need to modify it at all but so i can use .contains on it
        //i just thought it would be simpler instead of having to iterate through the whole thing
        List<String> monthsList = Arrays.asList(months);
        Boolean validMonth = false;
        //repeat until user enters valid month
        while (!validMonth) {
            try {
                //read input
                System.out.println("Enter your birth month: ");
                if (s.hasNext()) {
                    birthMonth = s.next();
                    s.nextLine();
                }
                //this handles strings that aren't a month and the catch catches anything that's not a string
                if (monthsList.contains(birthMonth)) {
                    validMonth = true;
                } else {
                    System.out.println("Invalid month, try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry, try again");
                s.next();
            }
        }
        //get astrological sign
        int index = monthsList.indexOf(birthMonth);
        String userSign = signs[index];
        System.out.println("You are a(n) "+userSign+"!");
        //get season
        String season;
        if (index < 2) {
            season = "winter";
        } else if (index < 5) {
            season = "spring";
        } else if (index < 8) {
            season = "summer";
        } else if (index < 11) {
            season = "fall";
        } else {
            season = "winter";
        }
        System.out.println("You were born in the "+season+".");
        //get days
        int birthMonthDays = days[index];
        System.out.println("Your birth month has "+birthMonthDays+" days.");


        // Part III (days alive 2: electric boogaloo, 2 days 2 alive, feat: a very slight amount of more accuracy) code below
        //assuming the current month is september
        int daysAlive = 365 * age;
        //the previous line has either underestimated so add or overestimated so subtract
        if (index < 8) {
            for (int i = index; i < 8; i++) {
                daysAlive += days[i];
            }
        } else if (index > 8) {
            for (int i = index; i >= 8; i++) {
                daysAlive -= days[i];
            }
        }
        System.out.println("You have been alive for approximately "+daysAlive+" days!");

    }
}