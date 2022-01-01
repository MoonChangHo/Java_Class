package Problem6;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Book> bookList;

    public Student(String name){
        this.name=name;
        bookList=new ArrayList<Book>();
    }
    public void readBook(String title,String author){
        Book book=new Book();
        book.setAuthor(author);
        book.setTitle(title);
        bookList.add(book);
    }
    public void showStudentReadInfo(){
        System.out.print(name+"학생이 읽은 책은 : ");
        for(Book s:bookList){
            System.out.print(s.getTitle()+" ");
        }
        System.out.println("");
    }



}
