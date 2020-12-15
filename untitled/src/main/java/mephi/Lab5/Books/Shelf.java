package mephi.Lab5.Books;


import java.util.ArrayList;
import java.util.Objects;

public class Shelf {
    private ArrayList<Book> books = new ArrayList<>();
    int shelfId;
    public ArrayList<Book> getBooks() {
        return books;
    }

    Shelf(int shelfId){
        this.shelfId=shelfId;
        books=new ArrayList<>();
    }

    Shelf(int shelfId,int size){
        books=new ArrayList<>(size);
    }
    public void deleteBook(int bookId)  {
        for (int i=0; i<books.size();i++){
            if (books.get(i).getBook_id()==bookId){
                books.remove(i);
            }
        }
    }

    public int getShelfId() {
        return shelfId;
    }

    public Book getBook(int bookID) {
        for (int i=0; i<books.size();i++){
            if (books.get(i).getBook_id()==bookID){
                return books.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()||o.hashCode()!=this.hashCode()) return false;
        Shelf shelf = (Shelf) o;
        return Objects.equals(books, shelf.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        String res="";
        for (int i =0; i<books.size();i++) {
           res += books.get(i).toString();
        }
        return res;
    }
}
