package facade;

public class MovieStreamingFacade 
{
    private VideoPlayer vid;
    private AudioSystem aud;
    private Subtitles sub;
    private NetworkManager net;
    public MovieStreamingFacade(VideoPlayer vid, AudioSystem aud, Subtitles sub, NetworkManager net) 
    {

        this.vid = vid;
        this.aud = aud;
        this.sub = sub;
        this.net = net;
    }
    public void startStreaming()
    {
        vid.play();
        aud.audioOn();
        sub.settings();
        sub.languageSelection();
        net.connect();
    }
    public void stopStreaming()
    {
        vid.stop();
        aud.audioOff();
        net.buffer();
    }
    
   

}
