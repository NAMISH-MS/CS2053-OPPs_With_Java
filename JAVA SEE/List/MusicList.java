// Lab 2: Music Playlist using LinkedList
// Create a menu-driven program using LinkedList to manage a playlist. The program must allow:
// 1. Adding a song at the beginning or end
// 2. Removing the first or last song
// 3. Replacing a song at a given index
// 4. Displaying the complete playlist

import java.util.*;

public class MusicList {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playList = new LinkedList<>();
        int choice;

        do { 
            System.out.println("\nMusic Playlist Management: ");
            System.out.println("1. Add song at the beginning.");
            System.out.println("2. Add song at the end.");
            System.out.println("3. Remove first song.");
            System.out.println("4. Remove last song.");
            System.out.println("5. Replace song at given index.");
            System.out.println("6.Display PlayList.");
            System.out.println("7.Exit.");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice){
                case 1:
                    System.out.println("Enter the song name to add at the beginning:");
                    playList.addFirst(sc.nextLine());
                    System.out.println("Song added at the beginning ." + playList);
                    break;
                case 2:
                    System.out.println("Enter the song name to add at the end: ");
                    playList.addLast(sc.nextLine());
                    System.out.println("Song added at the end." + playList);
                    break;
                case 3:
                    if(!playList.isEmpty()){
                        playList.removeFirst();
                        System.out.println("First song removed." + playList);
                    }else{
                        System.out.println("Playlist is empty. No song to remove.");
                    }
                    break;
            }

        } while (true);
    }
}
