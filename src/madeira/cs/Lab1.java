package madeira.cs;

/**
 * Author: Carina_Karp
 * Date: 9/3/2020
 **/
public class Lab1 {
    public static void main(String[] args) {
       /*
         Instructions For Use
         ------
         Write a program that does the following
         I. Declare and instantiate three strings
            a. Print each string separately
         II. Re-assign a new value to the strings you declared
            a. Print the new strings separately
         III. Visit the link in the README.md section
            a. Find three string methods you like
            b. Use them however you so choose
       */

        // Part I code below
        String test1 = "Alexa";
        System.out.println(test1);
        String test2 = "Emelia";
        System.out.println(test2);
        String test3 = "Jane";
        System.out.println(test3);

        // Part II code below
        test1 = "oatmeal";
        System.out.println(test1);
        test2 = "coffee";
        System.out.println(test2);
        test3 = "orange";
        System.out.println(test3);

        // Part III code below
        System.out.println(test1.length());
        System.out.println(test1 + " and " + test2);
        char firstLetter = test3.charAt(0);
        System.out.println(firstLetter);
    }
}