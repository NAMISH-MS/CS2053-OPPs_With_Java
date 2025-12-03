// Lab 1: Student List using ArrayList
// Create a Java program to manage a list of students using ArrayList. The program must allow:
// 1. Adding student records
// 2. Inserting a student at a specific index
// 3. Updating a student’s name
// 4. Removing a student by name or index
// 5. Displaying the list after every action



import java.util.*;

public class StudentList {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        int choice;

        do { 
            System.out.println("\nStudent List Management: ");
            System.out.println("1. Add Student. \n2. Insert Student at Index. \n3. Update Student Name. \n4. Remove Student by Index. \n5. Remove Student by name. \n6. Display Student List. \n7. Exit.");
            System.out.println("Enter your choice: ");
            choice =  sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice){
                case 1:
                    System.out.println("Enter student name:");
                    students.add(sc.nextLine());
                    System.out.println("Student added."+ students);
                    break;
                case 2:
                    System.out.println("Enter index to insert student: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    students.add(idx, sc.nextLine());
                    System.out.println("Student inserted."+ students);
                    break;

                case 3:
                    System.out.println("Enter index to update Student name: ");
                    int uidx = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new student name: ");
                    students.set(uidx, sc.nextLine());
                    System.out.println("Student name updated."+ students);
                    break;
                case 4:
                    System.out.println("Enter index to remove student: ");
                    int ridx = sc.nextInt();
                    sc.nextLine();
                    students.remove(ridx);
                    System.out.println("Student removed."+ students);
                    break;
                case 5:
                    System.out.println("Enter studnet name to remove: ");
                    String rname = sc.nextLine();
                    students.remove(rname);
                    System.out.println("Student removed." + students);
                    break;
                case 6:
                    System.out.println("Student List: " + students);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
