package song_to_song;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Artist artist = createArtist();
        System.out.println(artist.fullName());

        Song song = createSong(artist);
        System.out.println(song.outputData());
    }


    private static Artist createArtist() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the artist first name: ");
        String name = input.nextLine();

        System.out.println("Enter the artist last name: ");
        String last = input.nextLine();

        return new Artist(name, last);
    }

    private static Song createSong(Artist artist) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the song name: ");
        String songName = input.nextLine();

        System.out.println("Enter the song description: ");
        String description = input.nextLine();

        System.out.println("Enter the song duration: ");
        double duration = input.nextDouble();


        return new Song(songName, description, duration, artist);
    }
}