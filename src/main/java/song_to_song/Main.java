package song_to_song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to song to song");

        System.out.println("Instructions");
        System.out.println("Write #0 to exit program");
        System.out.println("Write #1 to add an artist");
        System.out.println("Write #2 to add a song");
        System.out.println("Write #3 to add an album");

        while (true) {
            System.out.println("Enter your choice");

            Scanner input = new Scanner(System.in);
            int userChoice = input.nextInt();

            if (userChoice == 0) {
                break;
            } else if (userChoice == 1) {
                Artist artist = createArtist();
                System.out.println(artist.fullName());
            } else if (userChoice == 2) {
                Artist artist = createArtist();
                Song song = createSong(artist);
                System.out.println(song.outputData());
            } else if (userChoice == 3) {
                Artist artist = createArtist();

                System.out.println("\nEnter the album name: ");
                String name = new Scanner(System.in).nextLine();

                System.out.println("Enter the album description: ");
                String description = new Scanner(System.in).nextLine();

                List<Song> songs = new ArrayList<>();

                while (true) {
                    System.out.println("Write #0 to stop adding songs");
                    System.out.println("Write #1 to add new song");

                    int userChoiceAlbum = input.nextInt();

                    if (userChoiceAlbum == 0) {
                        break;
                    } else if (userChoiceAlbum == 1) {
                        Song song = createSong(artist);
                        songs.add(song);
                    }
                }

                Album album = new Album(name, description, songs);
                System.out.println(album.outputData());
            }
        }
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