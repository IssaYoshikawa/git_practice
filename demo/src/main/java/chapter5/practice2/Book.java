import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment){
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o){
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public int compareTo(Book o){
        return CompareToBuilder.reflectionCompare(this, o);
    }

    public Book clone(){
        Book b = new Book(title, publishDate, comment);
        b.title = this.title;
        b.comment = this.comment;
        b.publishDate = this.publishDate;
        return b;
    }
}
