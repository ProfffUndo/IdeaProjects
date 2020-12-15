package mephi.Lab5.Books;

public class Book {
    private int book_id;
    private String book_name;
    private String author;

    Book(int id, String name, String author){
        book_id=id;
        book_name=name;
        this.author=author;
    }

    Book(){
        book_id = 0;
        book_name = null;
        book_name = null;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBook_name() {
        return book_name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
