package song_to_song;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello world");  //prints a welcome message

        System.out.println("Enter the artist first name: ");
        String name = input.nextLine();

        System.out.println("Enter the artist last name: ");
        String last = input.nextLine();

        Artist data = new Artist(name, last);

        System.out.println(data.displayFullName());
    }
}