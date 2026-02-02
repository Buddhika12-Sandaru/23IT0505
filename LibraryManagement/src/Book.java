public class Book {
    private String title;
    private String author;
    private String id;
    private int count;

    Book(String booktitle,String bookauthor,String bookid,int bookcount){
        this.title=booktitle;
        this.author=bookauthor;
        this.id=bookid;
        this.count=bookcount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getId() {
        return this.id;
    }

    public int getCount(){
        return this.count;
    }

    public void reduceBookCount(int bookCount){
        if(this.count>bookCount){
            this.count-=bookCount;
        }
    }

    public void displayInfo(){
        System.out.println("Book Title: " + this.title + " | Book Author: " + this.author + " | Book ID: " + this.id + " | Available Books: " + this.count);

    }
}
