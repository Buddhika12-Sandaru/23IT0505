import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true){
            System.out.println("##### Welcome to Student Management System #####");
            System.out.println("Press 1 for Adding a Student");
            System.out.println("Press 2 for View All Students");
            System.out.println("Press 3 for removing a Student");
            System.out.println("Press 4 for Exit");
            System.out.println("Choose Your Option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //create a new line

            switch (choice){
                case 1:
                    System.out.println("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.println("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter Student Age: ");
                    int age = scanner.nextInt();

                    Student newStudent = new Student(name,id,age);
                    manager.addStudents(newStudent);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.println("Enter Student ID to remove: ");
                    String removeId = scanner.nextLine();
                    manager.removeStudent(removeId);
                    break;

                case 4:
                    System.out.println("Exiting System......");
                    scanner.close();
                    return;

                default:
                    System.out.println("Wrong choice");

            }
        }
    }
}