package madeira.cs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Carina-
As I have come to expect from you: top notch code. Well commented, concise and 
efficient. I truly hope you find a use for your coding abilities in college and
beyond. 

*/
class Artist {
    String name; String album; String twitterHandle; int rating;

    public Artist(String n, String a, String handle) {
        name = n;
        album = a;
        twitterHandle = handle;
    }

    public void setRating(Scanner scanner) {
        System.out.println("Rate how much you like "+name+" on a scale of 1-10");
        //only testing for input type bc if user really hates an artist and wants to rate them -2
        //or loves them and wants to give them 11/10 who am i to stop them
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Invalid entry, try again");
        }
        rating = scanner.nextInt();
    }

}

public class SuperLab {
    /*
		Gebrauchsanweisung
		-------
		Write a program that does the following
		I. Creates a new class named Artist.
			a. Artist should have 3 member variables
				(a)i. name
				(a)ii. album
				(a)iii. twitterHandle
				(a)iv. rating
		II. Creates 6 methods to set & get each of these values + 1 main method
		III. Uses the main method to open the text file artistList.txt
		IV. Constructs an Artist for each of the entries in the list & adds them to an Array
			a. This will require: reading the size of the list and constructing the list to match
		V. Print each artist entry
			a. Make sure that you've constructed a rating member too! This is not in the file!
	*/



    public static void main(String[] args) {

        try {
            File artistFile = new File("/Users/carina/Desktop/IntroToCS/Mod1Labs/src/madeira/cs/artistList.txt");
            Scanner s = new Scanner(artistFile);

            //get length
            int length = s.nextInt();
            s.nextLine();

            //create array, read CSV, and set artist values
            Artist[] artists = new Artist[length];
            int i = 0;
            while (s.hasNextLine()) {
                String[] data = s.nextLine().split(",\\s*");
                artists[i] = new Artist(data[0], data[1], data[2]);
                i++;
            }
            s.close();

            //set ratings
            Scanner userInput = new Scanner(System.in);
            for (Artist a: artists) { a.setRating(userInput); }

            //print artist info
            System.out.println("Artist Catalogue: ");
            System.out.println("----------------------------");
            for (Artist a: artists) {
               System.out.println("Artist: "+a.name);
               System.out.println("Album: "+a.album);
               System.out.println("Twitter Handle: "+a.twitterHandle);
               System.out.println("User Rating: "+a.rating);
               System.out.println("----------------------------");
            }

        } catch (FileNotFoundException e) {
            System.out.println("error with the file...");
            e.printStackTrace();
        }


    }



}


