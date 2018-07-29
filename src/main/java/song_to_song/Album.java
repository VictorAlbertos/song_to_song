package song_to_song;

import java.util.List;

public class Album {
    private final String name, description;
    private final Artist artist;
    private final double totalDuration;
    private final List<Song> songs;

    public Album(String name, String description, List<Song> songs) {
        this.name = name;
        this.description = description;
        this.artist = songs.get(0).getArtist();

        double tempTotalDuration = 0;

        for (Song song : songs) {
            tempTotalDuration = tempTotalDuration + song.getSongDuration();
        }

        this.totalDuration = tempTotalDuration;
        this.songs = songs;
    }

    public String outputData() {
        return String.format("name: %s, description: %s, totalDuration: %s, %s, count of songs: %s",
                name, description, totalDuration, artist.fullName(), songs.size());
    }
}
