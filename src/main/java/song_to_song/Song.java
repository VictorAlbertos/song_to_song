package song_to_song;

public class Song {
    private final String songName, songDescription;
    private final double songDuration;
    private final Artist artist;

    public Song(String songName, String songDescription, double songDuration, Artist artist){
        this.songName = songName;
        this.songDescription = songDescription;
        this.songDuration = songDuration;
        this.artist = artist;
    }

    public String outputData() {
        return String.format("songName: %s, songDescription: %s, songDuration: %s, %s",
                songName, songDescription, songDuration, artist.fullName());
    }
}
