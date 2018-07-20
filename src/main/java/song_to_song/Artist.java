package song_to_song;

public class Artist {
    private final String artistName, artistLastName;

    public Artist(String artistName, String artistLastName) {
        this.artistName = artistName;
        this.artistLastName = artistLastName;
    }


    public String getFirstName() {
        return artistName;
    }


    public String getLastName() {
        return artistLastName;
    }

    public void displayFullName() {
        System.out.printf("\nThe artist name is: %s, %s",
                getLastName(), getFirstName());
    }
}