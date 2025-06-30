package Week_4.BehavioralPatterns.iterator;
import java.util.*;
public class PlayList implements SongCollection
{
   private List<Song> songs=new ArrayList<>();

   @Override
   public void addSongs(Song song) 
   {
        songs.add(song);
   }

   @Override
   public SongIterator iterator() 
   {
        return new PlayListIterator(songs);
   }

}
