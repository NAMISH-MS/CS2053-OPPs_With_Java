// Write a menu-driven program to manage student names using ArrayList.
import java.util.*;

public class StudentList {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        int choice;

        do { 
            
            System.out.println("Menu:");
            System.out.println("1. Add Student \n2. Update Student \n3. Remove student \n4. Display Students \n5.Exit" );
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice){
                case 1:
                    System.out.println("Enter name: ");
                    students.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Enter index to update: ");
                    int idx = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter new name: ");
                    students.set(idx, sc.nextLine());
                    break;
                case 3:
                    System.out.println("Enter name to remove:");
                    students.remove(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Students List: " + students);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;

            }


        } while (choice != 5);


    }
}
