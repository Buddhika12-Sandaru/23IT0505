import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager();

        while (true) {
            System.out.println(" ================ Library Management System ================ ");
            System.out.println("1 Add Books");
            System.out.println("2 View Books");
            System.out.println("3 Remove Books");
            System.out.println("4 Search Books");
            System.out.println("5 Buy Books");
            System.out.println("6 Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID: ");
                    String bookID = scanner.nextLine();

                    System.out.println("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();

                    System.out.println("Enter Book Author: ");
                    String bookAuthor = scanner.nextLine();

                    System.out.println("Enter Number of Copies: ");
                    int bookCount = scanner.nextInt();

                    Book book = new Book(bookTitle,bookAuthor, bookID, bookCount);
                    libraryManager.addBook(book);
                    break;

                case 2:
                    libraryManager.viewAllBooks();
                    break;

                case 3:
                    System.out.println("Enter Book ID: ");
                    String removeID = scanner.nextLine();
                    libraryManager.removeBook(removeID);
                    break;

                case 4:
                    System.out.println("Enter Book ID: ");
                    String searchID = scanner.nextLine();
                    libraryManager.searchBook(searchID);
                    break;

                case 5:
                    System.out.println("Enter Book ID: ");
                    String buyBookID = scanner.nextLine();

                    System.out.println("Enter Book Count: ");
                    int buyBookCount = scanner.nextInt();

                    libraryManager.buyBook(buyBookID,buyBookCount);
                    break;

                case 6:
                    System.out.println("Exiting System.......");
                    scanner.close();
                    return;

                default:
                    System.out.println("Wrong choice");


            }
        }
    }
}