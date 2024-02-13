interface Musicplayer{
    void play();
    void pause();
    void shuffle();
}

class WynkMusic implements Musicplayer {
    public void play(){
        System.out.println("Playing music");
    }
    public void pause(){
        System.out.println("Pausing the song");
    }
    public void shuffle(){
        System.out.println("Shuffling songs");
    }
    public void Play_Along(){
        System.out.println("Playing along with your favorite artist");
    }
}

class YTmusic1 implements Musicplayer {
    public void play(){
        System.out.println("Playing music");
    }
    public void pause(){
        System.out.println("Pausing the song");
    }
    public void shuffle(){
        System.out.println("Shuffling songs");
    }
    public void Subscription(){
        System.out.println("Subscribing to premium content / BUY for $129");
    }
}

public class Interface{
    public static void main(String[] args){
        WynkMusic wynk = new WynkMusic();
        wynk.play();
        wynk.pause();
        wynk.shuffle();
        wynk.Play_Along();

        YTmusic1 yt = new YTmusic1();
        yt.play();
        yt.pause();
        yt.shuffle();
        yt.Subscription();
    }
}