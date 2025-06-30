package Week_4.BehavioralPatterns.iterator;

public class IteratorPatternExample 
{
   public static void main(String[] args) 
   {
     PlayList playlist=new PlayList();
     playlist.addSongs(new Song("Arjith Singh","Tum Hi Ho"));
     playlist.addSongs(new Song("Sid Sriram", "Kadallae"));
     playlist.addSongs(new Song("Shreya Goshal", "Sooseki"));
     playlist.addSongs(new Song("Sunithi Chauhan", "Kamli"));
     SongIterator iterator=playlist.iterator();
     while(iterator.hasNext())
     {
        Song song=iterator.next();
        System.out.println(song.getTitle()+": "+song.getArtist());
     }
     
     
   }
}
