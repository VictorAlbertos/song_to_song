package song_to_song;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the artist first name: ");
        String name = input.nextLine();

        System.out.println("Enter the artist last name: ");
        String last = input.nextLine();

        Artist artist = new Artist(name, last);
        System.out.print(artist.fullName());

        System.out.println("Enter the song name: ");
        String songName = input.nextLine();

        System.out.println("Enter the song description: ");
        String description = input.nextLine();

        System.out.println("Enter the song duration: ");
        double duration = input.nextDouble();

        Song songData = new Song(songName, description, duration, artist);
    }
}