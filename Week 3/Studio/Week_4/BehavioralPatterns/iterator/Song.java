package Week_4.BehavioralPatterns.iterator;

public class Song 
{
    private String title;
    private String artist;

    public Song(String artist, String title) 
    {
        this.artist = artist;
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getArtist() 
    {
        return artist;
    }
    
}
