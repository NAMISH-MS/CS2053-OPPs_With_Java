interface AudioPlayer {
    void play();
    void stop();

    // default method
    default void mute() {
        System.out.println("Muting the audio.");
    }
}

class CDplayer implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing CD.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD.");
    }
}

class MP3player implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing MP3.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3.");
    }

    @Override
    public void mute() {
        System.out.println("Reducing volume of MP3 to 0.");
    }
}

public class AudioPlayerTest {
    public static void main(String[] args) {
        CDplayer myCD = new CDplayer();
        MP3player myMP3 = new MP3player();

        myCD.play();
        myCD.mute();
        myCD.stop();

        myMP3.play();
        myMP3.mute();
        myMP3.stop();
    }
}
