import java.util.ArrayList;
import java.util.Scanner;

public class Student_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- STUDENT ARRAY LIST MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Insert Student at specific index");
            System.out.println("3. Update Students name");
            System.out.println("4. Remove Student (by name or index)");
            System.out.println("5. Display Student List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter index (0 to " + students.size() + "): ");
                    int index = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (index >= 0 && index <= students.size()) {
                        System.out.print("Enter student name to insert: ");
                        String newStudent = sc.nextLine();
                        students.add(index, newStudent);
                        System.out.println("Student inserted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    if (!students.isEmpty()) {
                        System.out.print("Enter index of student to update (0 to " + (students.size() - 1) + "): ");
                        int updateIndex = sc.nextInt();
                        sc.nextLine();
                        if (updateIndex >= 0 && updateIndex < students.size()) {
                            System.out.print("Enter new name: ");
                            String updatedName = sc.nextLine();
                            students.set(updateIndex, updatedName);
                            System.out.println("Student name updated!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    } else {
                        System.out.println("No students in the list!");
                    }
                    break;

                case 4:
                    if (!students.isEmpty()) {
                        System.out.println("1. Remove by name");
                        System.out.println("2. Remove by index");
                        System.out.print("Choose option: ");
                        int removeChoice = sc.nextInt();
                        sc.nextLine();

                        if (removeChoice == 1) {
                            System.out.print("Enter name to remove: ");
                            String removeName = sc.nextLine();
                            if (students.remove(removeName)) {
                                System.out.println("Student removed by name!");
                            } else {
                                System.out.println("Name not found!");
                            }
                        } else if (removeChoice == 2) {
                            System.out.print("Enter index (0 to " + (students.size() - 1) + "): ");
                            int removeIndex = sc.nextInt();
                            sc.nextLine();
                            if (removeIndex >= 0 && removeIndex < students.size()) {
                                System.out.println("Removed: " + students.remove(removeIndex));
                            } else {
                                System.out.println("Invalid index!");
                            }
                        } else {
                            System.out.println("Invalid option!");
                        }
                    } else {
                        System.out.println("Student list is empty!");
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("No students to display!");
                    } else {
                        System.out.println("\nStudent List:");
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
