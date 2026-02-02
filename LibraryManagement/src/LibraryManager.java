import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book newBook){
        books.add(newBook);
        System.out.println("Book added successfully");
    }

    public void viewAllBooks(){
        for(Book eachBook:books){
            eachBook.displayInfo();
            System.out.println(" ");
        }
    }

    public void removeBook(String bookID){
        boolean found = false;
        for(Book eachBook:books){
            if(eachBook.getId().equalsIgnoreCase(bookID)){
                books.remove(eachBook);
                System.out.println("Book removed successfully");
                found = true;
                break;

            }
            if(!found){
                System.out.println("No Book Found with: " + bookID +"\n");
            }
        }
    }

    public void searchBook(String bookID){
        boolean found = false;
        for(Book eachBook:books){
            if(eachBook.getId().equalsIgnoreCase(bookID)){
                System.out.println("Book found successfully");
                eachBook.displayInfo();
                found = true;
                break;
            }
        }
    }

    public void buyBook(String bookID,int bookCount){
        boolean found = false;
        for(Book eachBook:books){
            if(eachBook.getId().equalsIgnoreCase(bookID)){
                found = true;
                if(eachBook.getCount() > 0){
                    eachBook.reduceBookCount(bookCount);
                    System.out.println("You bought " + bookCount + "Copies of " + eachBook.getTitle() + "\n");
                    System.out.println("Remaining stock: " + eachBook.getCount() + "\n");
                }else {
                    System.out.println("Not Available");
                }
                break;
            }
        }
    }
}
