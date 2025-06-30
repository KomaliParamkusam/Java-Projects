package Week_4.BehavioralPatterns.iterator;

public interface SongCollection 
{
    void addSongs(Song song);
    SongIterator iterator();
}
