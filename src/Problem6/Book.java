package Problem6;

public class Book {
    String title;
    String author;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showBookInfo(){
        System.out.println("제목 : "+title+", 저자 : "+author);
    }

}
