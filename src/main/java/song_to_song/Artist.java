package song_to_song;

public class Artist {

    private final String artistName, artistLastName;

    public Artist(String artistName, String artistLastName) {
        this.artistName = artistName;
        this.artistLastName = artistLastName;
    }

    public String fullName() {
        return String.format("artistName: %s, artistLastName: %s", artistName, artistLastName);
    }

}