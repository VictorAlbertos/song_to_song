package song_to_song;
import java.util.Scanner;

public class ConsoleUtils {

    public static int askForNumber( String message ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(message);
        return keyboard.nextInt();
    }
}
