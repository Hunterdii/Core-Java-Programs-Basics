interface MusicPlayer{
    void play();
    void stop();
    void next();
}
class Spotify implements MusicPlayer
{
    public void play()
    {
        System.out.println("Spotify : play music");
    }
    public void stop()
    {
        System.out.println("Spotify : stop music");
    }
    public void next()
    {
        System.out.println("Spotify : next music");
    }
    public void create_playlist()
    {
        System.out.println("Spotify : create_playlist");
    }
    public void subscription()
    {
        System.out.println("Spotify : subscription");
    }
}
class YTmusic implements MusicPlayer
{
    public void play()
    {
        System.out.println("YTmusic : play music");
    }
    public void stop()
    {
        System.out.println("YTmusic : stop music");
    }
    public void next()
    {
        System.out.println("YTmusic : next music");
    }
    public void shuffle()
    {
        System.out.println("YTmusic : shuffle music");
    }
    public void Repeat()
    {
        System.out.println("YTmusic : Repeat music");
    }

}
public class Music {
    public static void main(String[] args) {
        MusicPlayer spot = new Spotify();
        spot.play();
        spot.stop();
        spot.next();

        Spotify spo = new Spotify();
        spo.create_playlist();
        spo.subscription();

        MusicPlayer YT = new YTmusic();
        YT.play();
        YT.stop();
        YT.next();

        YTmusic YT1 = new YTmusic();
        
        YT1.shuffle();
        YT1.Repeat();
    }
}
