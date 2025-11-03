import java.util.LinkedList;
import java.util.Scanner;

public class Music_LinkedList{
    public static void main(String[] args){
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
            System.out.println("\n --- Music PlayList Menu ---");
            System.out.println("1. Add song at the beginning.");
            System.out.println("2. Add Song at the end.");
            System.out.println("3. Remove first song.");
            System.out.println("4. Remove last song.");
            System.out.println("5. Replace song at the given index.");
            System.out.println("6. Display playlist.");
            System.out.println("7. Exit.");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume new line

            switch(choice){
                case 1:
                System.out.println("Enter the song name to add at the beginning:");
                String firstSong = sc.nextLine();
                playlist.addFirst(firstSong);
                System.out.println("Song added at the beginning.");
                break;
                
                case 2:
                System.out.println("Enter the song name to add at the end: ");
                String lastSong = sc.nextLine();
                playlist.addLast(lastSong);
                System.out.println("Song added at the end.");
                break;

                case 3:
                if(!playlist.isEmpty()){
                    System.out.println("Removed song:" + playlist.removeFirst());   
                }else{
                    System.out.println("PlayList is empty.");
                }
                break;

                case 4:
                if(!playlist.isEmpty()){
                    System.out.println("Removed song:" + playlist.removeLast());
                }else{
                    System.out.println("PlayList is empty.");
                }
                break;

                case 5:
                if(!playlist.isEmpty()){
                    System.out.println("Enter the index to replace the song :");
                    int index = sc.nextInt();
                    sc.nextLine(); // Consume new Line
                    if(index >= 0 && index < playlist.size()){
                        System.out.println("Enter new song name: ");
                        String newSong = sc.nextLine();
                        playlist.set(index, newSong);
                        System.out.println("Song replaced Successfully.");
                    }else{
                        System.out.println("Invalid Index.");
                    }
                }else{
                    System.out.println("PlayList is empty.");
                }
                break;

                case 6:
                if(playlist.isEmpty()){
                    System.out.println("PlayList is empty.");
                }else{
                    System.out.println("\n Current PlayList:");
                    for(int i = 0; i < playlist.size(); i++){
                        System.out.println((i+1) + ". " + playlist.get(i));
                    }
                }
                break;

                case 7:
                System.out.println("Exiting... Goodbye!");
                break;

                default:
                System.out.println("Invalid choice. Please try again.");

            }

        } while (choice != 7);

        sc.close();
    }
}

