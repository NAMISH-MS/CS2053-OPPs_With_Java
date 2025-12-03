import java.util.*;

public class MusicPlayList {
    public static void main(String[] args){
        LinkedList<String> playList = new LinkedList<>();
        playList.add("Shape of You");
        playList.add("Perfect");
        playList.add("Blinding Lights");

        System.out.println("PlayList: \n" + playList);
        playList.remove("Perfect");
        System.out.println("After removing: \n" + playList);
    }
}
