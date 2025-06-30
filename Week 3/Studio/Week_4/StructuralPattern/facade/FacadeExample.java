package facade;

public class FacadeExample 
{
    public static void main(String[] args) 
    {
        MovieStreamingFacade movie=new MovieStreamingFacade(new VideoPlayer(), new AudioSystem(), new Subtitles(), new NetworkManager());
        movie.startStreaming();
        System.out.println("---------------------------");
        movie.stopStreaming();
    }
}
