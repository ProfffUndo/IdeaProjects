package mephi.Lab5.Books;

import java.util.ArrayList;
import java.util.Map;

public class BookStorage {
    private ArrayList<Shelf> shelves = new ArrayList<>();

    public void add(Shelf shelf){
       /* for(int i=0; i<shelves.size(); i++){
            if (shelves.get(i).equals(shelf)) {
                System.out.println("Полка уже существует");
                return;
            }
        }*/
        shelves.add(shelf);
    }

    public void add(Book book, Shelf shelf) throws NoSuchShelfException {//Убрать NoSuchBookException catch
         try {
             if (get(book.getBook_id()) != null) {
                 deleteBook(book.getBook_id());
             }
         }
         catch (NoSuchBookException nosbex){
             nosbex.printStackTrace();
             System.out.println("Book was not deleted");
         }
            boolean res=false;
            for(int i=0;i<shelves.size();i++){
                if(shelves.get(i).getShelfId()==shelf.getShelfId()) {
                    shelves.get(i).getBooks().add(book);
                    res=true;
                    break;
                }
            }
            if (!res){
                throw new NoSuchShelfException("Нет такой полки");
            }
    }


    public Book get(int bookId) {
        Book book = new Book();
        for (int i=0; i<shelves.size();i++){
           book = shelves.get(i).getBook(bookId);
        }
        if (book==null) {
            System.out.println("Нет книги с таким ID");
            return null;
        }
        return book;
    }

    public Shelf where(int bookId){
        Book book;
        for (int i=0; i<shelves.size();i++){
            book = shelves.get(i).getBook(bookId);
            if(book!=null) return shelves.get(i);
        }
        System.out.println("Нет книги с таким ID");
        return null;
    }

    public void deleteBook(int bookId) throws NoSuchBookException{
        boolean flag=false;
        for (int i=0; i<shelves.size();i++) {
            if (shelves.get(i).getBook(bookId) != null) {
                shelves.get(i).deleteBook(bookId);
                flag=true;
                break;
            }
        }
        if(!flag)
        throw new NoSuchBookException("Нет книги с таким ID");
    }

    @Override
    public String toString() {
        StringBuilder res= new StringBuilder();
        for (int i =0; i<shelves.size();i++) {
            res.append(shelves.get(i).toString());
        }
        return res.toString();
    }

    public void transaction(ArrayList<Map.Entry<Book,Shelf>> entries) throws NoSuchBookException,NoSuchShelfException{ //Поменять на Pair или создать свой
        int index=0;
        try{
          for(int i=0; i<entries.size(); i++){
              index=i;
              add(entries.get(i).getKey(),entries.get(i).getValue());
          }
      } catch (NoSuchShelfException noSuchShelfException){
            for (int i=0; i<index;i++)
            deleteBook(entries.get(i).getKey().getBook_id());
        }
    }
}
