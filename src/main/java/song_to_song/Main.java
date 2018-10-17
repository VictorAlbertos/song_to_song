package song_to_song;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean closeProgram = false;
        while (!closeProgram) {

            int choice = ConsoleUtils.askForNumber(
                    "\nEnter your choice for adding data (1 - Artist, 2 - Song, 3 - Album) or 0 to close program: ");
            switch (choice) {
                case 0:
                    closeProgram = true;
                    break;
                case 1:
                    System.out.println("Enter the data of the artist: ");
                    Artist.enterArtist();
                    break;
                case 2:
                    System.out.println("Enter the data of the song: ");
                    //enterSong();
                    break;
                case 3:
                    System.out.println("Enter the data of the album: ");
                    //enterAlbum();
                    break;
                default:
                    System.out.println("\nYour choice doesn´t exist, try again.");
                    break;
            }
        }
    }
}