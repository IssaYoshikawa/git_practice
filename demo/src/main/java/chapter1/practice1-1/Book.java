import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment){
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;

    }

    public Book(){

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        if(!title.equals(book.title)) return false;
        if(!publishDate.equals(book.publishDate)) return false;

        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.title, this.publishDate);
    }

    

    @Override
    public int compareTo(Book o){
        return this.publishDate.compareTo(o.publishDate);
    }

    @Override
    public Book clone(){
        Book b = new Book();
        b.title = this.title;
        b.publishDate = this.publishDate;
        b.publishDate = (Date)this.publishDate.clone();
        return b;
    }

    @Override
    public String toString(){
        return "Book[title=" + title + ", publishDate=" + publishDate + ", comment=" + comment + "]";
    }

    public String getTitle(){
        return this.title;
    }

    public Date getPublishDate(){
        return this.publishDate;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPublishDate(Date publishDate){
        this.publishDate = publishDate;
    }
}
