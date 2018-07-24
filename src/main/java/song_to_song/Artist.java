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

    public String fullName() {
        return String.format("The artist name is: %s, %s", getLastName(), getFirstName());
    }

}