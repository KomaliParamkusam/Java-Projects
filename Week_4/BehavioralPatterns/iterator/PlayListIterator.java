package Week_4.BehavioralPatterns.iterator;

import java.util.List;

public class PlayListIterator implements SongIterator
{
    private int index=0;
    private List<Song> songs;

    public PlayListIterator(List<Song> songs) 
    {
        this.songs = songs;
    }
    
    @Override
    public boolean hasNext() 
    {
       return index<songs.size();
    }

    @Override
    public Song next() 
    {
        return songs.get(index++);
    }
    
}
