package song_to_song;

public class Artist {

    private String artistName, artistLastName;

    public void setFirstName(String first){
        artistName = first;
    }

    public String getFirstName(){
        return artistName;
    }

    public void setLastName(String last) {
        artistLastName = last;
    }

    public String getLastName(){
        return artistLastName;
    }

    public void displayFullName(){
        System.out.printf("\nThe artist name is: %s, %s",
                getLastName(), getFirstName());
    }

}